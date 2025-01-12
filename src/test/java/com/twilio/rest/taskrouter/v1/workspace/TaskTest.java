/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.taskrouter.v1.workspace;

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

public class TaskTest {
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
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tasks/WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Task.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"age\": 25200,\"assignment_status\": \"pending\",\"attributes\": \"{\\\"body\\\": \\\"hello\\\"}\",\"date_created\": \"2014-05-14T18:50:02Z\",\"date_updated\": \"2014-05-15T07:26:06Z\",\"task_queue_entered_date\": \"2014-05-14T18:50:02Z\",\"priority\": 0,\"reason\": \"Test Reason\",\"sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_unique_name\": \"task-channel\",\"timeout\": 60,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_friendly_name\": \"Test Workflow\",\"task_queue_friendly_name\": \"Test Queue\",\"addons\": \"{}\",\"links\": {\"task_queue\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/TaskQueues/WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Reservations\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Task.fetcher("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tasks/WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addHeaderParam("If-Match", serialize("if_match"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Task.updater("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setIfMatch("if_match").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"age\": 25200,\"assignment_status\": \"pending\",\"attributes\": \"{\\\"body\\\": \\\"hello\\\"}\",\"date_created\": \"2014-05-14T18:50:02Z\",\"date_updated\": \"2014-05-15T07:26:06Z\",\"task_queue_entered_date\": \"2014-05-14T18:50:02Z\",\"priority\": 0,\"reason\": \"Test Reason\",\"sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_unique_name\": \"task-channel\",\"timeout\": 60,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_friendly_name\": \"Test Workflow\",\"task_queue_friendly_name\": \"Test Queue\",\"addons\": \"{}\",\"links\": {\"task_queue\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/TaskQueues/WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Reservations\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Task.updater("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setIfMatch("if_match").update(tw);
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tasks/WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addHeaderParam("If-Match", serialize("if_match"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Task.deleter("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setIfMatch("if_match").delete(tw);
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

        Task.deleter("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "WTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").setIfMatch("if_match").delete(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tasks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Task.reader("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending%2Creserved&PageSize=50&Page=0\",\"key\": \"tasks\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending%2Creserved&PageSize=50&Page=0\"},\"tasks\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"age\": 25200,\"assignment_status\": \"pending\",\"attributes\": \"{\\\"body\\\": \\\"hello\\\"}\",\"date_created\": \"2014-05-14T14:26:54Z\",\"date_updated\": \"2014-05-15T16:03:42Z\",\"task_queue_entered_date\": \"2014-05-14T14:26:54Z\",\"priority\": 0,\"reason\": \"Test Reason\",\"sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_unique_name\": \"task-channel\",\"timeout\": 60,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_friendly_name\": \"Test Workflow\",\"task_queue_friendly_name\": \"Test Queue\",\"addons\": \"{}\",\"links\": {\"task_queue\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/TaskQueues/WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Reservations\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Task.reader("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending&PageSize=50&Page=0\",\"key\": \"tasks\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending&PageSize=50&Page=0\"},\"tasks\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Task.reader("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadAssignmentStatusMultipleResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending&PageSize=50&Page=0\",\"key\": \"tasks\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks?TaskQueueSid=WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&Priority=1&TaskQueueName=task_queue_name&WorkflowName=workflow_name&WorkflowSid=WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&AssignmentStatus=pending&PageSize=50&Page=0\"},\"tasks\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Task.reader("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.TASKROUTER.toString(),
                                          "/v1/Workspaces/WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tasks");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Task.creator("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"age\": 25200,\"assignment_status\": \"pending\",\"attributes\": \"{\\\"body\\\": \\\"attributes\\\"}\",\"date_created\": \"2014-05-14T18:50:02Z\",\"date_updated\": \"2014-05-15T07:26:06Z\",\"task_queue_entered_date\": null,\"priority\": 1,\"reason\": \"Test Reason\",\"sid\": \"WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"task_channel_unique_name\": \"unique\",\"timeout\": 60,\"url\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow_friendly_name\": \"Example Workflow\",\"task_queue_friendly_name\": \"Example Task Queue\",\"addons\": \"{}\",\"links\": {\"task_queue\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/TaskQueues/WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workflow\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Workflows/WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"workspace\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reservations\": \"https://taskrouter.twilio.com/v1/Workspaces/WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Tasks/WTaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Reservations\"}}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Task.creator("WSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }
}