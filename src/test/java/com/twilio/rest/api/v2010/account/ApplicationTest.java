/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
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

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class ApplicationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Applications.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Application.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Mon, 22 Aug 2011 20:59:45 +0000\",\"date_updated\": \"Tue, 18 Aug 2015 16:48:57 +0000\",\"friendly_name\": \"Application Friendly Name\",\"message_status_callback\": \"http://www.example.com/sms-status-callback\",\"sid\": \"APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_fallback_method\": \"GET\",\"sms_fallback_url\": \"http://www.example.com/sms-fallback\",\"sms_method\": \"GET\",\"sms_status_callback\": \"http://www.example.com/sms-status-callback\",\"sms_url\": \"http://example.com\",\"status_callback\": \"http://example.com\",\"status_callback_method\": \"GET\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications/APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"GET\",\"voice_fallback_url\": \"http://www.example.com/voice-callback\",\"voice_method\": \"GET\",\"voice_url\": \"http://example.com\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Application.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Applications/APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Application.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        Application.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Applications/APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Application.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Mon, 22 Aug 2011 20:59:45 +0000\",\"date_updated\": \"Tue, 18 Aug 2015 16:48:57 +0000\",\"friendly_name\": \"Application Friendly Name\",\"message_status_callback\": \"http://www.example.com/sms-status-callback\",\"sid\": \"APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_fallback_method\": \"GET\",\"sms_fallback_url\": \"http://www.example.com/sms-fallback\",\"sms_method\": \"GET\",\"sms_status_callback\": \"http://www.example.com/sms-status-callback\",\"sms_url\": \"http://example.com\",\"status_callback\": \"http://example.com\",\"status_callback_method\": \"GET\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications/APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"GET\",\"voice_fallback_url\": \"http://www.example.com/voice-callback\",\"voice_method\": \"GET\",\"voice_url\": \"http://example.com\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Application.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Applications.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Application.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"applications\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Fri, 21 Aug 2015 00:07:25 +0000\",\"date_updated\": \"Fri, 21 Aug 2015 00:07:25 +0000\",\"friendly_name\": \"d8821fb7-4d01-48b2-bdc5-34e46252b90b\",\"message_status_callback\": null,\"sid\": \"APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_fallback_method\": \"POST\",\"sms_fallback_url\": null,\"sms_method\": \"POST\",\"sms_status_callback\": null,\"sms_url\": null,\"status_callback\": null,\"status_callback_method\": \"POST\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications/APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"POST\",\"voice_fallback_url\": null,\"voice_method\": \"POST\",\"voice_url\": null}],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json?PageSize=1&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"page_size\": 1,\"page\": 0,\"start\": 0,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json?PageSize=1&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Application.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"applications\": [],\"end\": 0,\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json?PageSize=1&Page=0\",\"previous_page_uri\": null,\"page_size\": 1,\"start\": 0,\"next_page_uri\": null,\"page\": 0,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications.json?PageSize=1&Page=0\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Application.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Applications/APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Application.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Mon, 22 Aug 2011 20:59:45 +0000\",\"date_updated\": \"Tue, 18 Aug 2015 16:48:57 +0000\",\"friendly_name\": \"Application Friendly Name\",\"message_status_callback\": \"http://www.example.com/sms-status-callback\",\"sid\": \"APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sms_fallback_method\": \"GET\",\"sms_fallback_url\": \"http://www.example.com/sms-fallback\",\"sms_method\": \"GET\",\"sms_status_callback\": \"http://www.example.com/sms-status-callback\",\"sms_url\": \"http://example.com\",\"status_callback\": \"http://example.com\",\"status_callback_method\": \"GET\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Applications/APaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"voice_caller_id_lookup\": false,\"voice_fallback_method\": \"GET\",\"voice_fallback_url\": \"http://www.example.com/voice-callback\",\"voice_method\": \"GET\",\"voice_url\": \"http://example.com\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Application.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "APXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }
}