/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trusthub.v1.customerprofiles;

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

public class CustomerProfilesChannelEndpointAssignmentTest {
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
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/CustomerProfiles/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/ChannelEndpointAssignments");
            request.addPostParam("ChannelEndpointType", serialize("channel_endpoint_type"));
            request.addPostParam("ChannelEndpointSid", serialize("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CustomerProfilesChannelEndpointAssignment.creator("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "channel_endpoint_type", "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"customer_profile_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_type\": \"phone-number\",\"date_created\": \"2019-07-31T02:34:41Z\",\"url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments/RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        CustomerProfilesChannelEndpointAssignment.creator("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "channel_endpoint_type", "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/CustomerProfiles/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/ChannelEndpointAssignments");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CustomerProfilesChannelEndpointAssignment.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CustomerProfilesChannelEndpointAssignment.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [{\"sid\": \"RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"customer_profile_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_type\": \"phone-number\",\"date_created\": \"2019-07-31T02:34:41Z\",\"url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments/RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments?ChannelEndpointSid=PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments?ChannelEndpointSid=PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CustomerProfilesChannelEndpointAssignment.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/CustomerProfiles/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/ChannelEndpointAssignments/RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CustomerProfilesChannelEndpointAssignment.fetcher("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"customer_profile_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_endpoint_type\": \"phone-number\",\"date_created\": \"2019-07-31T02:34:41Z\",\"url\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/ChannelEndpointAssignments/RAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CustomerProfilesChannelEndpointAssignment.fetcher("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/CustomerProfiles/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/ChannelEndpointAssignments/RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CustomerProfilesChannelEndpointAssignment.deleter("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        CustomerProfilesChannelEndpointAssignment.deleter("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}