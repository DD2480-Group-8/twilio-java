/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.notify.v1.service;

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

public class BindingTest {
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
                                          Domains.NOTIFY.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Bindings/BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Binding.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"a7c658f4111ec4ff5a1a647f9d0edd819025b9f20522d2fae897049f32873e73\",\"binding_type\": \"apn\",\"credential_sid\": null,\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"endpoint\": \"26607274\",\"identity\": \"24987039\",\"notification_protocol_version\": \"3\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tags\": [\"26607274\"],\"links\": {\"user\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/24987039\"},\"url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings/BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Binding.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.NOTIFY.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Bindings/BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Binding.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        Binding.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "BSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.NOTIFY.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Bindings");
            request.addPostParam("Identity", serialize("identity"));
            request.addPostParam("BindingType", serialize(Binding.BindingType.APN));
            request.addPostParam("Address", serialize("address"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Binding.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", Binding.BindingType.APN, "address").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"a7c658f4111ec4ff5a1a647f9d0edd819025b9f20522d2fae897049f32873e73\",\"binding_type\": \"apn\",\"credential_sid\": null,\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"endpoint\": \"26607274\",\"identity\": \"24987039\",\"notification_protocol_version\": \"3\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tags\": [\"26607274\"],\"links\": {\"user\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/24987039\"},\"url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings/BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Binding.creator("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", Binding.BindingType.APN, "address").create(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.NOTIFY.toString(),
                                          "/v1/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Bindings");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Binding.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"bindings\": [],\"meta\": {\"first_page_url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings?Tag=tag&Identity=identity&PageSize=50&Page=0\",\"key\": \"bindings\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings?Tag=tag&Identity=identity&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Binding.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"bindings\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"address\": \"a7c658f4111ec4ff5a1a647f9d0edd819025b9f20522d2fae897049f32873e73\",\"binding_type\": \"apn\",\"credential_sid\": null,\"date_created\": \"2015-07-30T20:00:00Z\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"endpoint\": \"26607274\",\"identity\": \"24987039\",\"notification_protocol_version\": \"3\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sid\": \"BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tags\": [\"26607274\"],\"links\": {\"user\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Users/24987039\"},\"url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings/BSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings?Tag=tag&Identity=identity&PageSize=50&Page=0\",\"key\": \"bindings\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://notify.twilio.com/v1/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Bindings?Tag=tag&Identity=identity&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Binding.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }
}