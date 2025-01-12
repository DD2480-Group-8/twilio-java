package com.twilio.base;

import com.twilio.Twilio;
import com.twilio.http.TwilioRestClient;

import java.util.concurrent.CompletableFuture;

/**
 * Executor for fetches of a resource.
 *
 * @param <T> type of the resource
 */
public abstract class Fetcher<T extends Resource> {

    /**
     * Execute an async request using default client.
     *
     * @param tw Twilio object
     * @return future that resolves to requested object
     */
    public CompletableFuture<T> fetchAsync(Twilio tw) {
        return fetchAsync(tw.getRestClient());
    }

    /**
     * Execute an async request using specified client.
     *
     * @param client client used to make request
     * @return future that resolves to requested object
     */
    public CompletableFuture<T> fetchAsync(final TwilioRestClient client) {
        return CompletableFuture.supplyAsync(() -> fetch(client), Twilio.getExecutorService());
    }

    /**
     * Execute a request using default client.
     *
     * @param tw Twilio object
     * @return Requested object
     */
    public T fetch(Twilio tw) {
        return fetch(tw.getRestClient());
    }

    /**
     * Execute a request using specified client.
     *
     * @param client client used to make request
     * @return Requested object
     */
    public abstract T fetch(final TwilioRestClient client);
}
