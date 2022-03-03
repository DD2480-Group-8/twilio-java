/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1;

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

public class EsimProfileTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/ESimProfiles");
            request.addPostParam("Eid", serialize("eid"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EsimProfile.creator("eid").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateDefaultSmdpResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": null,\"sim_sid\": null,\"status\": \"reserving\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": null,\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        EsimProfile.creator("eid").create();
    }

    @Test
    public void testCreateWithCallbackResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": null,\"sim_sid\": null,\"status\": \"reserving\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": null,\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        EsimProfile.creator("eid").create();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/ESimProfiles/HPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EsimProfile.fetcher("HPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": \"8988307aaaaaaaaaaaaa\",\"sim_sid\": \"HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"available\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": \"https://sm-dp-plus.twilio.com\",\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EsimProfile.fetcher("HPXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.SUPERSIM.toString(),
                                          "/v1/ESimProfiles");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            EsimProfile.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadAllResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"esim_profiles\": [{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": \"8988307aaaaaaaaaaaaa\",\"sim_sid\": \"HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"available\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": \"https://sm-dp-plus.twilio.com\",\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/ESimProfiles?PageSize=50&Page=0\",\"key\": \"esim_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/ESimProfiles?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EsimProfile.reader().read());
    }

    @Test
    public void testReadByEidResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"esim_profiles\": [{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": \"8988307aaaaaaaaaaaaa\",\"sim_sid\": \"HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"available\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": \"https://sm-dp-plus.twilio.com\",\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/ESimProfiles?Eid=89049032005008882600033489aaaaaa&PageSize=50&Page=0\",\"key\": \"esim_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/ESimProfiles?Eid=89049032005008882600033489aaaaaa&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EsimProfile.reader().read());
    }

    @Test
    public void testReadBySimSidResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"esim_profiles\": [{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": \"8988307aaaaaaaaaaaaa\",\"sim_sid\": \"HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"available\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": \"https://sm-dp-plus.twilio.com\",\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/ESimProfiles?SimSid=HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\",\"key\": \"esim_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/ESimProfiles?SimSid=HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EsimProfile.reader().read());
    }

    @Test
    public void testReadByStatusResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"esim_profiles\": [{\"sid\": \"HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"iccid\": \"8988307aaaaaaaaaaaaa\",\"sim_sid\": \"HSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"downloaded\",\"eid\": \"89049032005008882600033489aaaaaa\",\"smdp_plus_address\": \"https://sm-dp-plus.twilio.com\",\"error_code\": null,\"error_message\": null,\"date_created\": \"2020-09-01T20:00:00Z\",\"date_updated\": \"2020-09-01T20:00:00Z\",\"url\": \"https://supersim.twilio.com/v1/ESimProfiles/HPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"first_page_url\": \"https://supersim.twilio.com/v1/ESimProfiles?Status=downloaded&PageSize=50&Page=0\",\"key\": \"esim_profiles\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://supersim.twilio.com/v1/ESimProfiles?Status=downloaded&PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(EsimProfile.reader().read());
    }
}