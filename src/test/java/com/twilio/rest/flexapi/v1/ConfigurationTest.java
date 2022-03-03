/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.flexapi.v1;

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

public class ConfigurationTest {
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
                                          Domains.FLEXAPI.toString(),
                                          "/v1/Configuration");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Configuration.fetcher().fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2016-08-01T22:10:40Z\",\"date_updated\": \"2016-08-01T22:10:40Z\",\"attributes\": {\"main_attribute\": \"some_attribute\"},\"status\": \"ok\",\"taskrouter_workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_taskqueue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_taskqueues\": [{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"targettable\": true},{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"targettable\": false}],\"taskrouter_skills\": [{\"name\": \"sales\",\"multivalue\": false,\"minimum\": 0,\"maximum\": 0},{\"name\": \"support\",\"multivalue\": true,\"minimum\": 0,\"maximum\": 10}],\"taskrouter_worker_channels\": {\"agent\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 1},{\"name\": \"voice\",\"availability\": false,\"capacity\": 2}],\"supervisor\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 2}]},\"taskrouter_worker_attributes\": {\"agent\": {\"region\": \"us-east\"},\"supervisor\": {\"region\": \"us\"}},\"taskrouter_offline_activity_sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"runtime_domain\": \"https://flex.twilio.com\",\"messaging_service_instance_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flex_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ui_language\": \"en\",\"ui_attributes\": {},\"ui_dependencies\": {},\"ui_version\": \"1.0\",\"service_version\": \"1.0\",\"call_recording_enabled\": true,\"call_recording_webhook_url\": \"https://www.example.com/call-recording\",\"crm_enabled\": true,\"crm_type\": \"custom\",\"crm_callback_url\": \"https://crm.com/a\",\"crm_fallback_url\": \"https://crm.com/b\",\"crm_attributes\": {\"crm_attribute\": \"some_crm\"},\"public_attributes\": {\"public\": \"test\"},\"plugin_service_enabled\": true,\"plugin_service_attributes\": {\"agent-logger\": \"^3.10.5\",\"typewriter\": \"^7.0.1\"},\"integrations\": [{\"name\": \"twilio\",\"type\": \"http\",\"active\": true,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\",\"logo\": \"logo1\",\"author\": \"somebody1\"},{\"name\": \"twilio-stage\",\"type\": \"http\",\"active\": false,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\"}],\"outbound_call_flows\": {\"default\": {\"caller_id\": \"+12345\",\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"location\": \"EE\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}},\"queue_stats_configuration\": {\"default\": {\"service_level_threshold\": 20,\"short_abandoned_threshold\": 5,\"reset_timezone\": \"America/New_York\",\"reset_time\": \"00:00\"},\"queue_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reset_timezone\": \"Europe/Tallinn\",\"reset_time\": \"01:00\"},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"reset_timezone\": \"Europe/Paris\",\"reset_time\": \"02:00\"}],\"queue_channel_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_level_threshold\": 10,\"short_abandoned_threshold\": 10},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"service_level_threshold\": 30,\"short_abandoned_threshold\": 15}]},\"serverless_service_sids\": [\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"],\"notifications\": {\"enabled\": true,\"mode\": \"whenNotInFocus\"},\"markdown\": {\"enabled\": false,\"mode\": \"readOnly\"},\"flex_insights_hr\": {\"advanced_reporting_enabled\": true,\"advanced_reporting_workspaces\": [{\"id\": \"ID_1\",\"timezone\": \"America/Los_Angeles\",\"workspace_id\": \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"id\": \"ID_2\",\"timezone\": \"Etc/UTC\"}]},\"url\": \"https://flex-api.twilio.com/v1/Configuration\",\"flex_insights_drilldown\": true,\"flex_url\": \"https://flex.twilio.com\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Configuration.fetcher().fetch());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.FLEXAPI.toString(),
                                          "/v1/Configuration");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Configuration.creator().create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2016-08-01T22:10:40Z\",\"date_updated\": \"2016-08-01T22:10:40Z\",\"attributes\": {\"main_attribute\": \"some_attribute\"},\"status\": \"ok\",\"taskrouter_workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_taskqueue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_taskqueues\": [{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"targettable\": true},{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"targettable\": false}],\"taskrouter_skills\": [{\"name\": \"sales\",\"multivalue\": false,\"minimum\": 0,\"maximum\": 0},{\"name\": \"support\",\"multivalue\": true,\"minimum\": 0,\"maximum\": 10}],\"taskrouter_worker_channels\": {\"agent\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 1},{\"name\": \"voice\",\"availability\": false,\"capacity\": 2}],\"supervisor\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 2}]},\"taskrouter_worker_attributes\": {\"agent\": {\"region\": \"us-east\"},\"supervisor\": {\"region\": \"us\"}},\"taskrouter_offline_activity_sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"runtime_domain\": \"https://flex.twilio.com\",\"messaging_service_instance_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flex_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ui_language\": \"en\",\"ui_attributes\": {},\"ui_dependencies\": {},\"ui_version\": \"1.0\",\"service_version\": \"1.0\",\"call_recording_enabled\": true,\"call_recording_webhook_url\": \"https://www.example.com/call-recording\",\"crm_enabled\": true,\"crm_type\": \"custom\",\"crm_callback_url\": \"https://crm.com/a\",\"crm_fallback_url\": \"https://crm.com/b\",\"crm_attributes\": {\"crm_attribute\": \"some_crm\"},\"public_attributes\": {\"public\": \"test\"},\"plugin_service_enabled\": true,\"plugin_service_attributes\": {\"agent-logger\": \"^3.10.5\",\"typewriter\": \"^7.0.1\"},\"integrations\": [{\"name\": \"twilio\",\"type\": \"http\",\"active\": true,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\",\"logo\": \"logo1\",\"author\": \"somebody1\"},{\"name\": \"twilio-stage\",\"type\": \"http\",\"active\": false,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\"}],\"outbound_call_flows\": {\"default\": {\"caller_id\": \"+12345\",\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"location\": \"EE\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}},\"queue_stats_configuration\": {\"default\": {\"service_level_threshold\": 20,\"short_abandoned_threshold\": 5,\"reset_timezone\": \"America/New_York\",\"reset_time\": \"00:00\"},\"queue_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reset_timezone\": \"Europe/Tallinn\",\"reset_time\": \"01:00\"},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"reset_timezone\": \"Europe/Paris\",\"reset_time\": \"02:00\"}],\"queue_channel_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_level_threshold\": 10,\"short_abandoned_threshold\": 10},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"service_level_threshold\": 30,\"short_abandoned_threshold\": 15}]},\"serverless_service_sids\": [\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"],\"notifications\": {\"enabled\": true,\"mode\": \"whenNotInFocus\"},\"markdown\": {\"enabled\": false,\"mode\": \"readOnly\"},\"flex_insights_hr\": null,\"url\": \"https://flex-api.twilio.com/v1/Configuration\",\"flex_insights_drilldown\": false,\"flex_url\": \"https://flex.twilio.com\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Configuration.creator().create();
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.FLEXAPI.toString(),
                                          "/v1/Configuration");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Configuration.updater().update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2016-08-01T22:10:40Z\",\"date_updated\": \"2016-08-01T22:10:40Z\",\"attributes\": {\"main_attribute\": \"some_attribute\"},\"status\": \"ok\",\"taskrouter_workspace_sid\": \"WSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_target_taskqueue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"taskrouter_taskqueues\": [{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"targettable\": true},{\"sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac\",\"targettable\": false}],\"taskrouter_skills\": [{\"name\": \"sales\",\"multivalue\": false,\"minimum\": 0,\"maximum\": 0},{\"name\": \"support\",\"multivalue\": true,\"minimum\": 0,\"maximum\": 10}],\"taskrouter_worker_channels\": {\"agent\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 1},{\"name\": \"voice\",\"availability\": false,\"capacity\": 2}],\"supervisor\": [{\"name\": \"default\",\"availability\": true,\"capacity\": 2}]},\"taskrouter_worker_attributes\": {\"agent\": {\"region\": \"us-east\"},\"supervisor\": {\"region\": \"us\"}},\"taskrouter_offline_activity_sid\": \"WAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"runtime_domain\": \"https://flex.twilio.com\",\"messaging_service_instance_sid\": \"MGaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"chat_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"flex_service_instance_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ui_language\": \"en\",\"ui_attributes\": {},\"ui_dependencies\": {},\"ui_version\": \"1.0\",\"service_version\": \"1.0\",\"call_recording_enabled\": true,\"call_recording_webhook_url\": \"https://www.example.com/call-recording\",\"crm_enabled\": true,\"crm_type\": \"custom\",\"crm_callback_url\": \"https://crm.com/a\",\"crm_fallback_url\": \"https://crm.com/b\",\"crm_attributes\": {\"crm_attribute\": \"some_crm\"},\"public_attributes\": {\"public\": \"test\"},\"plugin_service_enabled\": false,\"plugin_service_attributes\": {\"agent-logger\": \"^3.10.5\",\"typewriter\": \"^7.0.1\"},\"integrations\": [{\"name\": \"twilio\",\"type\": \"http\",\"active\": true,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\",\"logo\": \"logo1\",\"author\": \"somebody1\"},{\"name\": \"twilio-stage\",\"type\": \"http\",\"active\": false,\"config\": \"{\\\"callback\\\":\\\"twilio.com/cb\\\",\\\"allowed_methods\\\":[\\\"GET\\\",\\\"POST\\\"]}\"}],\"outbound_call_flows\": {\"default\": {\"caller_id\": \"+12345\",\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"location\": \"EE\",\"workflow_sid\": \"WWaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}},\"queue_stats_configuration\": {\"default\": {\"service_level_threshold\": 20,\"short_abandoned_threshold\": 5,\"reset_timezone\": \"America/New_York\",\"reset_time\": \"00:00\"},\"queue_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reset_timezone\": \"Europe/Tallinn\",\"reset_time\": \"01:00\"},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"reset_timezone\": \"Europe/Paris\",\"reset_time\": \"02:00\"}],\"queue_channel_configurations\": [{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_level_threshold\": 10,\"short_abandoned_threshold\": 10},{\"queue_sid\": \"WQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"channel_sid\": \"TCaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"service_level_threshold\": 30,\"short_abandoned_threshold\": 15}]},\"serverless_service_sids\": [\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ZSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"],\"notifications\": {\"enabled\": true,\"mode\": \"whenNotInFocus\"},\"markdown\": {\"enabled\": false,\"mode\": \"readOnly\"},\"flex_insights_hr\": {\"advanced_reporting_enabled\": true,\"advanced_reporting_workspaces\": [{\"id\": \"ID_1\",\"timezone\": \"America/Los_Angeles\",\"workspace_id\": \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"id\": \"ID_2\",\"timezone\": \"Etc/UTC\"}]},\"url\": \"https://flex-api.twilio.com/v1/Configuration\",\"flex_insights_drilldown\": true,\"flex_url\": \"https://flex.twilio.com\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Configuration.updater().update();
    }
}