/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.sip.domain.authtypes.authtypecalls;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class AuthCallsIpAccessControlListMappingTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/Domains/SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Auth/Calls/IpAccessControlListMappings.json");
            request.addPostParam("IpAccessControlListSid", serialize("ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthCallsIpAccessControlListMapping.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"sid\": \"ALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AuthCallsIpAccessControlListMapping.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/Domains/SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Auth/Calls/IpAccessControlListMappings.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthCallsIpAccessControlListMapping.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/Domains/SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Auth/Calls/IpAccessControlListMappings.json?PageSize=50&Page=0\",\"end\": 0,\"previous_page_uri\": null,\"contents\": [],\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/Domains/SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Auth/Calls/IpAccessControlListMappings.json?PageSize=50&Page=0\",\"page_size\": 50,\"start\": 0,\"next_page_uri\": null,\"page\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthCallsIpAccessControlListMapping.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/Domains/SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Auth/Calls/IpAccessControlListMappings.json?PageSize=50&Page=0\",\"end\": 0,\"previous_page_uri\": null,\"contents\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"sid\": \"ALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/SIP/Domains/SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Auth/Calls/IpAccessControlListMappings.json?PageSize=50&Page=0\",\"page_size\": 50,\"start\": 0,\"next_page_uri\": null,\"page\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthCallsIpAccessControlListMapping.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/Domains/SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Auth/Calls/IpAccessControlListMappings/ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthCallsIpAccessControlListMapping.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"date_updated\": \"Thu, 30 Jul 2015 20:00:00 +0000\",\"friendly_name\": \"friendly_name\",\"sid\": \"ALaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthCallsIpAccessControlListMapping.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/SIP/Domains/SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Auth/Calls/IpAccessControlListMappings/ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthCallsIpAccessControlListMapping.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testDeleteResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("null", TwilioRestClient.HTTP_STATUS_CODE_NO_CONTENT);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AuthCallsIpAccessControlListMapping.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ALXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}