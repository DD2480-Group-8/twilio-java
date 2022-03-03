/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1;

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

public class AddressConfigurationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Configuration/Addresses");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AddressConfiguration.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadAllResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://conversations.twilio.com/v1/Configuration/Addresses?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"address_configurations\"},\"address_configurations\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"+37256123457\",\"type\": \"sms\",\"friendly_name\": \"My Test Configuration\",\"auto_creation\": {\"enabled\": true,\"type\": \"webhook\",\"conversation_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"webhook_url\": \"https://example.com\",\"webhook_method\": \"POST\",\"webhook_filters\": [\"onParticipantAdded\",\"onMessageAdded\"]},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:50Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"address\": \"+37256123458\",\"type\": \"sms\",\"friendly_name\": \"Studio Test Configuration\",\"auto_creation\": {\"enabled\": false,\"type\": \"studio\",\"conversation_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"studio_flow_sid\": \"FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"studio_retry_count\": 3},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:50Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"},{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"address\": \"+37256123459\",\"type\": \"sms\",\"friendly_name\": \"Default Test Configuration\",\"auto_creation\": {\"enabled\": true,\"type\": \"default\"},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:50Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AddressConfiguration.reader().read());
    }

    @Test
    public void testReadBlankResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://conversations.twilio.com/v1/Configuration/Addresses?PageSize=50&Page=0\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses?PageSize=50&Page=0\",\"previous_page_url\": null,\"next_page_url\": null,\"key\": \"address_configurations\"},\"address_configurations\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AddressConfiguration.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Configuration/Addresses/IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AddressConfiguration.fetcher("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"+37256123457\",\"type\": \"sms\",\"friendly_name\": \"My Test Configuration\",\"auto_creation\": {\"enabled\": true,\"type\": \"webhook\",\"conversation_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"webhook_url\": \"https://example.com\",\"webhook_method\": \"POST\",\"webhook_filters\": [\"onParticipantAdded\",\"onMessageAdded\"]},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:50Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AddressConfiguration.fetcher("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Configuration/Addresses");
            request.addPostParam("Type", serialize(AddressConfiguration.Type.SMS));
            request.addPostParam("Address", serialize("address"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AddressConfiguration.creator(AddressConfiguration.Type.SMS, "address").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"+37256123457\",\"type\": \"sms\",\"friendly_name\": \"My Test Configuration\",\"auto_creation\": {\"enabled\": true,\"type\": \"webhook\",\"conversation_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"webhook_url\": \"https://example.com\",\"webhook_method\": \"POST\",\"webhook_filters\": [\"onParticipantAdded\",\"onMessageAdded\"]},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:50Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AddressConfiguration.creator(AddressConfiguration.Type.SMS, "address").create();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Configuration/Addresses/IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AddressConfiguration.updater("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"+37256123457\",\"type\": \"sms\",\"friendly_name\": \"My Test Configuration Updated\",\"auto_creation\": {\"enabled\": false,\"type\": \"studio\",\"conversation_service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"studio_flow_sid\": \"FWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"studio_retry_count\": 3},\"date_created\": \"2016-03-24T21:05:50Z\",\"date_updated\": \"2016-03-24T21:05:51Z\",\"url\": \"https://conversations.twilio.com/v1/Configuration/Addresses/IGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AddressConfiguration.updater("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.CONVERSATIONS.toString(),
                                          "/v1/Configuration/Addresses/IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AddressConfiguration.deleter("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        AddressConfiguration.deleter("IGXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}