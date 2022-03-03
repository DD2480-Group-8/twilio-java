/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1.conference;

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

public class ConferenceParticipantTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants/CPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConferenceParticipant.fetcher("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"participant_sid\": \"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_direction\": \"outbound\",\"from\": \"+10000000000\",\"to\": \"+1000000001\",\"call_status\": \"completed\",\"country_code\": \"US\",\"is_moderator\": true,\"join_time\": \"2021-10-08T02:58:59Z\",\"leave_time\": \"2021-10-08T03:00:02Z\",\"duration_seconds\": 64,\"outbound_queue_length\": 0,\"outbound_time_in_queue\": 965,\"jitter_buffer_size\": null,\"is_coach\": false,\"coached_participants\": null,\"participant_region\": \"us1\",\"conference_region\": \"us1\",\"call_type\": \"carrier\",\"processing_state\": \"complete\",\"properties\": {\"start_conference_on_enter\": false,\"end_conference_on_exit\": false,\"play_early_media\": false,\"enter_muted\": true,\"beep_on_enter\": false,\"beep_on_exit\": false},\"events\": {\"mute\": [1633705131000]},\"metrics\": {\"inbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 49,\"packet_loss_percentage\": 0.0,\"jitter\": {\"avg\": 0.34,\"max\": 0.53},\"latency\": {\"avg\": 0.0,\"max\": 0.0},\"mos\": 4.4},\"outbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 126,\"packet_loss_percentage\": 0,\"jitter\": {\"avg\": 0.01,\"max\": 0.01},\"latency\": {\"avg\": 0,\"max\": 0},\"mos\": 4.4}},\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConferenceParticipant.fetcher("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Participants");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            ConferenceParticipant.reader("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"participants\"},\"participants\": [{\"participant_sid\": \"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_direction\": \"outbound\",\"from\": \"+10000000000\",\"to\": \"+10000000001\",\"call_status\": \"completed\",\"country_code\": \"US\",\"is_moderator\": true,\"join_time\": \"2021-10-08T02:58:51Z\",\"leave_time\": \"2021-10-08T02:59:55Z\",\"duration_seconds\": 65,\"outbound_queue_length\": 0,\"outbound_time_in_queue\": 3361,\"jitter_buffer_size\": null,\"is_coach\": false,\"coached_participants\": null,\"participant_region\": \"us1\",\"conference_region\": \"us1\",\"call_type\": \"carrier\",\"processing_state\": \"complete\",\"properties\": {\"start_conference_on_enter\": true,\"end_conference_on_exit\": false,\"play_early_media\": true,\"enter_muted\": false,\"beep_on_enter\": false,\"beep_on_exit\": false},\"metrics\": {\"inbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 70,\"packet_loss_percentage\": 0.0,\"jitter\": {\"avg\": 0.41,\"max\": 0.84},\"latency\": {\"avg\": 0.0,\"max\": 0.0},\"mos\": 4.4},\"outbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 126,\"packet_loss_percentage\": 0,\"jitter\": {\"avg\": 0.01,\"max\": 0.01},\"latency\": {\"avg\": 0,\"max\": 0},\"mos\": 4.4}},\"events\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"participant_sid\": \"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"label\": null,\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_direction\": \"outbound\",\"from\": \"+10000000000\",\"to\": \"+10000000002\",\"call_status\": \"completed\",\"country_code\": \"US\",\"is_moderator\": true,\"join_time\": \"2021-10-08T02:58:52Z\",\"leave_time\": \"2021-10-08T02:59:54Z\",\"duration_seconds\": 63,\"outbound_queue_length\": 0,\"outbound_time_in_queue\": 321,\"jitter_buffer_size\": null,\"is_coach\": false,\"coached_participants\": null,\"participant_region\": \"us1\",\"conference_region\": \"us1\",\"call_type\": \"carrier\",\"processing_state\": \"complete\",\"properties\": {\"start_conference_on_enter\": false,\"end_conference_on_exit\": false,\"early_media\": false,\"enter_muted\": true,\"beep_on_enter\": false,\"beep_on_exit\": false},\"metrics\": {\"inbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 16,\"packet_loss_percentage\": 0,\"jitter\": {\"avg\": 0.26,\"max\": 0.45},\"latency\": {\"avg\": 0,\"max\": 0},\"mos\": 4.4},\"outbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 42,\"packet_loss_percentage\": 0,\"jitter\": {\"avg\": 0.03,\"max\": 0.08},\"latency\": {\"avg\": 0,\"max\": 0},\"mos\": 4.4,\"tags\": [\"silent\"]}},\"events\": {\"mute\": [1633705131000]},\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConferenceParticipant.reader("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadWithLabelResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?Label=client&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants?Label=client&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"participants\"},\"participants\": [{\"participant_sid\": \"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_sid\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"call_direction\": \"outbound\",\"from\": \"+10000000000\",\"to\": \"+10000000001\",\"call_status\": \"completed\",\"country_code\": \"US\",\"is_moderator\": true,\"join_time\": \"2021-10-08T02:58:51Z\",\"leave_time\": \"2021-10-08T02:59:55Z\",\"duration_seconds\": 65,\"label\": \"client\",\"outbound_queue_length\": 0,\"outbound_time_in_queue\": 3361,\"jitter_buffer_size\": null,\"is_coach\": false,\"coached_participants\": null,\"participant_region\": \"us1\",\"conference_region\": \"us1\",\"call_type\": \"carrier\",\"processing_state\": \"complete\",\"properties\": {\"start_conference_on_enter\": true,\"end_conference_on_exit\": false,\"play_early_media\": true,\"enter_muted\": false,\"beep_on_enter\": false,\"beep_on_exit\": false},\"metrics\": {\"inbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 70,\"packet_loss_percentage\": 0.0,\"jitter\": {\"avg\": 0.41,\"max\": 0.84},\"latency\": {\"avg\": 0.0,\"max\": 0.0},\"mos\": 4.4},\"outbound\": {\"total_packets_lost\": 0,\"total_packets_received\": 96,\"packet_loss_percentage\": 0,\"jitter\": {\"avg\": 0.01,\"max\": 0.01},\"latency\": {\"avg\": 0,\"max\": 0},\"mos\": 4.4}},\"events\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants/CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(ConferenceParticipant.reader("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }
}