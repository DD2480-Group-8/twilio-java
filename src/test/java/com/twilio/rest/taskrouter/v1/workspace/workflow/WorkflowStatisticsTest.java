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

public class WorkflowStatisticsTest {
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
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Workflows/WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Statistics");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            WorkflowStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Statistics\",\"cumulative\": {\"avg_task_acceptance_time\": 0.0,\"end_time\": \"2008-01-02T00:00:00Z\",\"reservations_accepted\": 0,\"reservations_rejected\": 0,\"reservations_timed_out\": 0,\"start_time\": \"2008-01-02T00:00:00Z\",\"tasks_canceled\": 0,\"tasks_entered\": 0,\"tasks_moved\": 0,\"tasks_timed_out_in_workflow\": 0},\"realtime\": {\"longest_task_waiting_age\": 0,\"longest_task_waiting_sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"tasks_by_status\": {\"assigned\": 1,\"pending\": 0,\"reserved\": 0,\"wrapping\": 0},\"total_tasks\": 1},\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(WorkflowStatistics.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WWXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}