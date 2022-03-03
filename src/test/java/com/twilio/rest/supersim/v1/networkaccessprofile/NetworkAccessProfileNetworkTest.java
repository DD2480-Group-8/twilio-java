/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1.networkaccessprofile;

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

public class NetworkAccessProfileNetworkTest {
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
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Networks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfileNetwork.reader("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks?PageSize=50&Page=0\",\"key\": \"networks\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks?PageSize=50&Page=0\"},\"networks\": [{\"sid\": \"HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"network_access_profile_sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"AT&T\",\"iso_country\": \"us\",\"identifiers\": [{\"mcc\": \"310\",\"mnc\": \"410\"}],\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks/HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(NetworkAccessProfileNetwork.reader("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Networks");
            request.addPostParam("Network", serialize("HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfileNetwork.creator("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"network_access_profile_sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"AT&T\",\"iso_country\": \"us\",\"identifiers\": [{\"mcc\": \"310\",\"mnc\": \"410\"}],\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks/HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        NetworkAccessProfileNetwork.creator("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Networks/HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfileNetwork.deleter("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        NetworkAccessProfileNetwork.deleter("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/NetworkAccessProfiles/HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Networks/HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            NetworkAccessProfileNetwork.fetcher("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"network_access_profile_sid\": \"HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"AT&T\",\"iso_country\": \"us\",\"identifiers\": [{\"mcc\": \"310\",\"mnc\": \"410\"}],\"url\": \"https://supersim.twilio.com/v1/NetworkAccessProfiles/HAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Networks/HWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(NetworkAccessProfileNetwork.fetcher("HAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "HWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }
}