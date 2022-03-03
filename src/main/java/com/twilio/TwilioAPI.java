package com.twilio;

import com.twilio.exception.ApiException;
import com.twilio.exception.AuthenticationException;
import com.twilio.exception.CertificateValidationException;
import com.twilio.http.*;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwilioAPI {

    public static final String VERSION = "8.27.0";
    public static final String JAVA_VERSION = System.getProperty("java.version");

    private static String username = System.getenv("TWILIO_ACCOUNT_SID");
    private static String password = System.getenv("TWILIO_AUTH_TOKEN");
    private static String accountSid; // username used if this is null
    private static String region = System.getenv("TWILIO_REGION");
    private static String edge = System.getenv("TWILIO_EDGE");
    private static volatile TwilioRestClient restClient;
    private static volatile ExecutorService executorService;

    public TwilioAPI(final String username, final String password) {
        TwilioAPI.setUsername(username);
        TwilioAPI.setPassword(password);
    }

    public TwilioAPI(final String username, final String password, final String accountSid) {
        TwilioAPI.setUsername(username);
        TwilioAPI.setPassword(password);
    }

    /**
     * Set the username.
     *
     * @param username account to use
     * @throws AuthenticationException if username is null
     */
    public static synchronized void setUsername(final String username) {
        if (username == null) {
            throw new AuthenticationException("Username can not be null");
        }

        if (!username.equals(TwilioAPI.username)) {
            TwilioAPI.invalidate();
        }

        TwilioAPI.username = username;
    }

    /**
     * Set the auth token.
     *
     * @param password auth token to use
     * @throws AuthenticationException if password is null
     */
    public static synchronized void setPassword(final String password) {
        if (password == null) {
            throw new AuthenticationException("Password can not be null");
        }

        if (!password.equals(TwilioAPI.password)) {
            TwilioAPI.invalidate();
        }

        TwilioAPI.password = password;
    }

    /**
     * Set the account sid.
     *
     * @param accountSid account sid to use
     * @throws AuthenticationException if account sid is null
     */
    public static synchronized void setAccountSid(final String accountSid) {
        if (accountSid == null) {
            throw new AuthenticationException("AccountSid can not be null");
        }

        if (!accountSid.equals(TwilioAPI.accountSid)) {
            TwilioAPI.invalidate();
        }

        TwilioAPI.accountSid = accountSid;
    }

    /**
     * Set the region.
     *
     * @param region region to make request
     */
    public static synchronized void setRegion(final String region) {
        if (!Objects.equals(region, TwilioAPI.region)) {
            TwilioAPI.invalidate();
        }

        TwilioAPI.region = region;
    }

    /**
     * Set the edge.
     *
     * @param edge edge to make request
     */
    public static synchronized void setEdge(final String edge) {
        if (!Objects.equals(edge, TwilioAPI.edge)) {
            TwilioAPI.invalidate();
        }

        TwilioAPI.edge = edge;
    }

    /**
     * Returns (and initializes if not initialized) the TwilioAPI Rest Client.
     *
     * @return the TwilioAPI Rest Client
     * @throws AuthenticationException if initialization required and either accountSid or authToken is null
     */
    public static TwilioRestClient getRestClient() {
        if (TwilioAPI.restClient == null) {
            synchronized (TwilioAPI.class) {
                if (TwilioAPI.restClient == null) {
                    TwilioAPI.restClient = buildRestClient();
                }
            }
        }

        return TwilioAPI.restClient;
    }

    private static TwilioRestClient buildRestClient() {
        if (TwilioAPI.username == null || TwilioAPI.password == null) {
            throw new AuthenticationException(
                    "TwilioRestClient was used before AccountSid and AuthToken were set, please call TwilioAPI.init()"
            );
        }

        TwilioRestClient.Builder builder = new TwilioRestClient.Builder(TwilioAPI.username, TwilioAPI.password);

        if (TwilioAPI.accountSid != null) {
            builder.accountSid(TwilioAPI.accountSid);
        }

        builder.region(TwilioAPI.region);
        builder.edge(TwilioAPI.edge);

        return builder.build();
    }

    /**
     * Use a custom rest client.
     *
     * @param restClient rest client to use
     */
    public static void setRestClient(final TwilioRestClient restClient) {
        synchronized (TwilioAPI.class) {
            TwilioAPI.restClient = restClient;
        }
    }

    /**
     * Returns the TwilioAPI executor service.
     *
     * @return the TwilioAPI executor service
     */
    public static ExecutorService getExecutorService() {
        if (TwilioAPI.executorService == null) {
            synchronized (TwilioAPI.class) {
                if (TwilioAPI.executorService == null) {
                    TwilioAPI.executorService = Executors.newCachedThreadPool();
                }
            }
        }
        return TwilioAPI.executorService;
    }

    /**
     * Use a custom executor service.
     *
     * @param executorService executor service to use
     */
    public static void setExecutorService(final ExecutorService executorService) {
        synchronized (TwilioAPI.class) {
            TwilioAPI.executorService = executorService;
        }
    }

    /**
     * Validate that we can connect to the new SSL certificate posted on api.twilio.com.
     *
     * @throws CertificateValidationException if the connection fails
     */
    public static void validateSslCertificate() {
        final NetworkHttpClient client = new NetworkHttpClient();
        final Request request = new Request(HttpMethod.GET, "https://api.twilio.com:8443");

        try {
            final Response response = client.makeRequest(request);

            if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
                throw new CertificateValidationException(
                        "Unexpected response from certificate endpoint", request, response
                );
            }
        } catch (final ApiException e) {
            throw new CertificateValidationException("Could not get response from certificate endpoint", request);
        }
    }

    /**
     * Invalidates the volatile state held in the TwilioAPI singleton.
     */
    private static void invalidate() {
        TwilioAPI.restClient = null;
    }

    /**
     * Attempts to gracefully shutdown the ExecutorService if it is present.
     */
    public static synchronized void destroy() {
        if (executorService != null) {
            executorService.shutdown();
        }
    }
}
