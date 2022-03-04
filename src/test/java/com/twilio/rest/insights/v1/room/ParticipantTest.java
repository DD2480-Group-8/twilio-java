/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1.room;

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

public class ParticipantTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Video/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants/PAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "PAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"publisher_info\": {},\"edge_location\": \"ashburn\",\"join_time\": \"2015-07-30T20:00:00Z\",\"leave_time\": \"2015-07-30T20:00:00Z\",\"end_reason\": \"disconnected_via_api\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"error_code\": 0,\"media_region\": \"us1\",\"properties\": {},\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"error_code_url\": \"error_code_url\",\"participant_sid\": \"PAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"codecs\": [\"VP8\"],\"status\": \"in_progress\",\"duration_sec\": 50000000,\"participant_identity\": \"participant_identity\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/PAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.fetcher("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "PAXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Video/Rooms/RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Participant.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=50&Page=0\",\"key\": \"participants\",\"first_page_url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=50&Page=0\",\"page_size\": 50,\"next_page_url\": null,\"page\": 0,\"previous_page_url\": null},\"participants\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=50&Page=0\",\"key\": \"participants\",\"first_page_url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=50&Page=0\",\"page_size\": 50,\"next_page_url\": null,\"page\": 0,\"previous_page_url\": null},\"participants\": [{\"publisher_info\": {},\"edge_location\": \"ashburn\",\"join_time\": \"2015-07-30T20:00:00Z\",\"leave_time\": \"2015-07-30T20:00:00Z\",\"end_reason\": \"disconnected_via_api\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"error_code\": 53205,\"media_region\": \"us1\",\"properties\": {},\"room_sid\": \"RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"error_code_url\": \"error_code_url\",\"participant_sid\": \"PAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"codecs\": [\"VP8\"],\"status\": \"in_progress\",\"duration_sec\": 50000000,\"participant_identity\": \"participant_identity\",\"url\": \"https://insights.twilio.com/v1/Video/Rooms/RMaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/PAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Participant.reader("RMXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }
}