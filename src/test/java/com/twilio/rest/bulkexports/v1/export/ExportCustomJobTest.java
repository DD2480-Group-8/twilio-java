/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.bulkexports.v1.export;

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

public class ExportCustomJobTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;
    
    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.BULKEXPORTS.toString(),
                                          "/v1/Exports/resource_type/Jobs");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ExportCustomJob.reader("resource_type").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"previous_page_url\": null,\"url\": \"https://bulkexports.twilio.com/v1/Exports/Messages/Jobs?PageSize=50&Page=0\",\"page_size\": 50,\"key\": \"jobs\",\"first_page_url\": \"https://bulkexports.twilio.com/v1/Exports/Messages/Jobs?PageSize=50&Page=0\",\"next_page_url\": null,\"page\": 0},\"jobs\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ExportCustomJob.reader("resource_type").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"previous_page_url\": null,\"url\": \"https://bulkexports.twilio.com/v1/Exports/Messages/Jobs?PageSize=50&Page=0\",\"page_size\": 50,\"key\": \"jobs\",\"first_page_url\": \"https://bulkexports.twilio.com/v1/Exports/Messages/Jobs?PageSize=50&Page=0\",\"next_page_url\": null,\"page\": 0},\"jobs\": [{\"start_day\": \"start_day\",\"job_sid\": \"JSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"webhook_method\": \"webhook_method\",\"details\": {},\"end_day\": \"end_day\",\"webhook_url\": \"webhook_url\",\"email\": \"email\",\"resource_type\": \"resource_type\",\"job_queue_position\": \"1\",\"estimated_completion_time\": \"2021-03-15T20:20:14.547\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ExportCustomJob.reader("resource_type").read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.BULKEXPORTS.toString(),
                                          "/v1/Exports/resource_type/Jobs");
            request.addPostParam("StartDay", serialize("start_day"));
            request.addPostParam("EndDay", serialize("end_day"));
            request.addPostParam("FriendlyName", serialize("friendly_name"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ExportCustomJob.creator("resource_type", "start_day", "end_day", "friendly_name").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"start_day\": \"start_day\",\"job_sid\": \"JSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"friendly_name\",\"webhook_method\": \"webhook_method\",\"details\": {},\"end_day\": \"end_day\",\"webhook_url\": \"webhook_url\",\"email\": \"email\",\"resource_type\": \"resource_type\",\"job_queue_position\": \"1\",\"estimated_completion_time\": \"2021-03-15T20:20:14.547\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        ExportCustomJob.creator("resource_type", "start_day", "end_day", "friendly_name").create(tw);
    }
}