/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.voice.v1.connectionpolicy;

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

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class ConnectionPolicyTargetTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VOICE.toString(),
                                          "/v1/ConnectionPolicies/NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Targets");
            request.addPostParam("Target", serialize(URI.create("https://example.com")));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConnectionPolicyTarget.creator("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", URI.create("https://example.com")).create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"connection_policy_sid\": \"NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"target\": \"sip:sip-box.com:1234\",\"priority\": 1,\"weight\": 20,\"enabled\": true,\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:36Z\",\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets/NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        ConnectionPolicyTarget.creator("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", URI.create("https://example.com")).create(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VOICE.toString(),
                                          "/v1/ConnectionPolicies/NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Targets/NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConnectionPolicyTarget.fetcher("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"connection_policy_sid\": \"NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"target\": \"sip:sip-box.com:1234\",\"priority\": 1,\"weight\": 20,\"enabled\": true,\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets/NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConnectionPolicyTarget.fetcher("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VOICE.toString(),
                                          "/v1/ConnectionPolicies/NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Targets");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConnectionPolicyTarget.reader("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"targets\"},\"targets\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"connection_policy_sid\": \"NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"target\": \"sip:sip-box.com:1234\",\"priority\": 1,\"weight\": 20,\"enabled\": true,\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets/NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConnectionPolicyTarget.reader("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"targets\"},\"targets\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConnectionPolicyTarget.reader("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VOICE.toString(),
                                          "/v1/ConnectionPolicies/NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Targets/NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConnectionPolicyTarget.updater("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"connection_policy_sid\": \"NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"updated_name\",\"target\": \"sip:sip-updated.com:4321\",\"priority\": 2,\"weight\": 10,\"enabled\": false,\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/ConnectionPolicies/NYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Targets/NEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        ConnectionPolicyTarget.updater("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.VOICE.toString(),
                                          "/v1/ConnectionPolicies/NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Targets/NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConnectionPolicyTarget.deleter("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        ConnectionPolicyTarget.deleter("NYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "NEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}