/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace.workflow;

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

public class WorkflowCumulativeStatisticsTest {
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
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Workflows/WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/CumulativeStatistics");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            WorkflowCumulativeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"avg_task_acceptance_time\": 100,\"tasks_canceled\": 100,\"start_time\": \"2015-07-30T20:00:00Z\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tasks_moved\": 100,\"tasks_entered\": 100,\"wait_duration_until_canceled\": {\"avg\": 0,\"min\": 0,\"max\": 0,\"total\": 0},\"wait_duration_until_accepted\": {\"avg\": 0,\"min\": 0,\"max\": 0,\"total\": 0},\"split_by_wait_time\": {\"5\": {\"above\": {\"tasks_canceled\": 0,\"reservations_accepted\": 0},\"below\": {\"tasks_canceled\": 0,\"reservations_accepted\": 0}},\"10\": {\"above\": {\"tasks_canceled\": 0,\"reservations_accepted\": 0},\"below\": {\"tasks_canceled\": 0,\"reservations_accepted\": 0}}},\"reservations_canceled\": 100,\"end_time\": \"2015-07-30T20:00:00Z\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations_created\": 100,\"reservations_accepted\": 100,\"reservations_rescinded\": 100,\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations_rejected\": 100,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/CumulativeStatistics\",\"tasks_deleted\": 100,\"tasks_timed_out_in_workflow\": 100,\"tasks_completed\": 100,\"reservations_timed_out\": 100}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(WorkflowCumulativeStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}