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

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class FieldTypeTest {
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
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/FieldTypes/UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FieldType.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"unique_name\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"field_values\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldValues\"},\"sid\": \"UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(FieldType.fetcher("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/FieldTypes");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FieldType.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes?PageSize=50&Page=0\",\"first_page_url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"page\": 0,\"page_size\": 50,\"next_page_url\": null,\"key\": \"field_types\"},\"field_types\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(FieldType.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes?PageSize=50&Page=0\",\"first_page_url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"page\": 0,\"page_size\": 50,\"next_page_url\": null,\"key\": \"field_types\"},\"field_types\": [{\"unique_name\": \"unique_name\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"field_values\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldValues\"},\"sid\": \"UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(FieldType.reader("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/FieldTypes");
            request.addPostParam("UniqueName", serialize("unique_name"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FieldType.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "unique_name").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"unique_name\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"field_values\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldValues\"},\"sid\": \"UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        FieldType.creator("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "unique_name").create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/FieldTypes/UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FieldType.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"unique_name\": \"unique_name\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"assistant_sid\": \"UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2015-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"url\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"2015-07-30T20:00:00Z\",\"links\": {\"field_values\": \"https://autopilot.twilio.com/v1/Assistants/UAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldTypes/UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/FieldValues\"},\"sid\": \"UBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        FieldType.updater("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.AUTOPILOT.toString(),
                                          "/v1/Assistants/UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/FieldTypes/UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FieldType.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        FieldType.deleter("UAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "UBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}