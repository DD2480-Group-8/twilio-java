/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.autopilot.v1.assistant;

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

public class WebhookTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Webhooks/UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Webhook.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks/UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"unique_name\": \"unique_name\",\"events\": \"ondialogueend\",\"webhook_url\": \"https://example.com/url\",\"webhook_method\": \"POST\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Webhook.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Webhooks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Webhook.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"key\": \"webhooks\",\"page_size\": 50,\"next_page_url\": null,\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks?PageSize=50&Page=0\",\"page\": 0,\"first_page_url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks?PageSize=50&Page=0\",\"previous_page_url\": null},\"webhooks\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Webhook.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"key\": \"webhooks\",\"page_size\": 50,\"next_page_url\": null,\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks?PageSize=50&Page=0\",\"page\": 0,\"first_page_url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks?PageSize=50&Page=0\",\"previous_page_url\": null},\"webhooks\": [{\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks/UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"unique_name\": \"unique_name\",\"events\": \"ondialogueend\",\"webhook_url\": \"https://example.com/url\",\"webhook_method\": \"POST\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Webhook.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Webhooks");
            request.addPostParam("UniqueName", serialize("unique_name"));
            request.addPostParam("Events", serialize("events"));
            request.addPostParam("WebhookUrl", serialize(URI.create("https://example.com")));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Webhook.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "unique_name", "events", URI.create("https://example.com")).create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks/UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"unique_name\": \"unique_name\",\"events\": \"ondialogueend\",\"webhook_url\": \"https://example.com/url\",\"webhook_method\": \"POST\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Webhook.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "unique_name", "events", URI.create("https://example.com")).create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Webhooks/UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Webhook.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Webhooks/UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"UMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"unique_name\": \"unique_name\",\"events\": \"ondialogueend\",\"webhook_url\": \"https://example.com/url\",\"webhook_method\": \"POST\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Webhook.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Webhooks/UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Webhook.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        Webhook.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}