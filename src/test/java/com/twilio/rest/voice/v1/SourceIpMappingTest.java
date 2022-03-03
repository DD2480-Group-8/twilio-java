/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.voice.v1;

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

public class SourceIpMappingTest {
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
                                          Domains.VOICE.toString(),
                                          "/v1/SourceIpMappings");
            request.addPostParam("IpRecordSid", serialize("ILXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            request.addPostParam("SipDomainSid", serialize("SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SourceIpMapping.creator("ILXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ip_record_sid\": \"ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sip_domain_sid\": \"SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:36Z\",\"url\": \"https://voice.twilio.com/v1/SourceIpMappings/IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        SourceIpMapping.creator("ILXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VOICE.toString(),
                                          "/v1/SourceIpMappings/IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SourceIpMapping.fetcher("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ip_record_sid\": \"ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sip_domain_sid\": \"SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/SourceIpMappings/IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SourceIpMapping.fetcher("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.VOICE.toString(),
                                          "/v1/SourceIpMappings");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SourceIpMapping.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://voice.twilio.com/v1/SourceIpMappings?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://voice.twilio.com/v1/SourceIpMappings?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"source_ip_mappings\"},\"source_ip_mappings\": [{\"sid\": \"IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ip_record_sid\": \"ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sip_domain_sid\": \"SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/SourceIpMappings/IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SourceIpMapping.reader().read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://voice.twilio.com/v1/SourceIpMappings?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://voice.twilio.com/v1/SourceIpMappings?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"source_ip_mappings\"},\"source_ip_mappings\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SourceIpMapping.reader().read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.VOICE.toString(),
                                          "/v1/SourceIpMappings/IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            request.addPostParam("SipDomainSid", serialize("SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SourceIpMapping.updater("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ip_record_sid\": \"ILaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sip_domain_sid\": \"SDaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"date_created\": \"2020-03-18T23:31:36Z\",\"date_updated\": \"2020-03-18T23:31:37Z\",\"url\": \"https://voice.twilio.com/v1/SourceIpMappings/IBaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        SourceIpMapping.updater("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "SDXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.VOICE.toString(),
                                          "/v1/SourceIpMappings/IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SourceIpMapping.deleter("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
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

        SourceIpMapping.deleter("IBXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete();
    }
}