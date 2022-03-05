/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.wireless.v1;

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

public class RatePlanTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.WIRELESS.toString(),
                                          "/v1/RatePlans");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RatePlan.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://wireless.twilio.com/v1/RatePlans?PageSize=50&Page=0\",\"key\": \"rate_plans\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://wireless.twilio.com/v1/RatePlans?PageSize=50&Page=0\"},\"rate_plans\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RatePlan.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://wireless.twilio.com/v1/RatePlans?PageSize=50&Page=0\",\"key\": \"rate_plans\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://wireless.twilio.com/v1/RatePlans?PageSize=50&Page=0\"},\"rate_plans\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"data_enabled\": true,\"data_limit\": 1000,\"data_metering\": \"payg\",\"date_created\": \"2019-07-30T20:00:00Z\",\"date_updated\": \"2019-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"messaging_enabled\": true,\"voice_enabled\": true,\"national_roaming_enabled\": true,\"national_roaming_data_limit\": 1000,\"international_roaming\": [\"data\",\"messaging\",\"voice\"],\"international_roaming_data_limit\": 1000,\"sid\": \"WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"usage_notification_method\": \"POST\",\"usage_notification_url\": \"https://callback.com\",\"data_limit_strategy\": \"block\",\"url\": \"https://wireless.twilio.com/v1/RatePlans/WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RatePlan.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.WIRELESS.toString(),
                                          "/v1/RatePlans/WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RatePlan.fetcher("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"data_enabled\": true,\"data_limit\": 1000,\"data_metering\": \"payg\",\"date_created\": \"2019-07-30T20:00:00Z\",\"date_updated\": \"2019-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"messaging_enabled\": true,\"voice_enabled\": true,\"national_roaming_enabled\": true,\"national_roaming_data_limit\": 1000,\"international_roaming\": [\"data\",\"messaging\",\"voice\"],\"international_roaming_data_limit\": 1000,\"sid\": \"WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"usage_notification_method\": \"POST\",\"usage_notification_url\": \"https://callback.com\",\"data_limit_strategy\": \"block\",\"url\": \"https://wireless.twilio.com/v1/RatePlans/WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(RatePlan.fetcher("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.WIRELESS.toString(),
                                          "/v1/RatePlans");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RatePlan.creator().create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"data_enabled\": true,\"data_limit\": 1000,\"data_limit_strategy\": \"block\",\"data_metering\": \"payg\",\"date_created\": \"2019-07-30T20:00:00Z\",\"date_updated\": \"2019-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"messaging_enabled\": true,\"voice_enabled\": true,\"national_roaming_enabled\": true,\"national_roaming_data_limit\": 1000,\"international_roaming\": [\"data\",\"messaging\",\"voice\"],\"international_roaming_data_limit\": 1000,\"sid\": \"WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"usage_notification_method\": \"POST\",\"usage_notification_url\": \"https://callback.com\",\"url\": \"https://wireless.twilio.com/v1/RatePlans/WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        RatePlan.creator().create(tw);
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.WIRELESS.toString(),
                                          "/v1/RatePlans/WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RatePlan.updater("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"unique_name\": \"unique_name\",\"data_enabled\": true,\"data_limit\": 1000,\"data_metering\": \"payg\",\"date_created\": \"2019-07-30T20:00:00Z\",\"date_updated\": \"2019-07-30T20:00:00Z\",\"friendly_name\": \"friendly_name\",\"messaging_enabled\": true,\"voice_enabled\": true,\"national_roaming_enabled\": true,\"national_roaming_data_limit\": 1000,\"international_roaming\": [\"data\",\"messaging\",\"voice\"],\"international_roaming_data_limit\": 1000,\"sid\": \"WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"usage_notification_method\": \"POST\",\"usage_notification_url\": \"https://callback.com\",\"data_limit_strategy\": \"block\",\"url\": \"https://wireless.twilio.com/v1/RatePlans/WPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        RatePlan.updater("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.WIRELESS.toString(),
                                          "/v1/RatePlans/WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            RatePlan.deleter("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        RatePlan.deleter("WPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}