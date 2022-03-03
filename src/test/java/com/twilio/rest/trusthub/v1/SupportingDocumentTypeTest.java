/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trusthub.v1;

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

public class SupportingDocumentTypeTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/SupportingDocumentTypes");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SupportingDocumentType.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"supporting_document_types\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"supporting_document_types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SupportingDocumentType.reader().read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"supporting_document_types\": [{\"url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes/OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"fields\": [{\"machine_name\": \"address_sids\",\"friendly_name\": \"Address Sids\",\"constraint\": \"List\"}],\"machine_name\": \"customer_profile_address\",\"friendly_name\": \"Customer profile address\",\"sid\": \"OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"},{\"url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes/OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"fields\": [{\"machine_name\": \"first_name\",\"friendly_name\": \"First Name\",\"constraint\": \"String\"},{\"machine_name\": \"last_name\",\"friendly_name\": \"Last Name\",\"constraint\": \"String\"},{\"machine_name\": \"business_name\",\"friendly_name\": \"Business Name\",\"constraint\": \"String\"}],\"machine_name\": \"government_issued_proof_of_authorized_representative\",\"friendly_name\": \"Government Issued Identity certifying proof of being an authorized representative of a company\",\"sid\": \"OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"supporting_document_types\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SupportingDocumentType.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/SupportingDocumentTypes/OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            SupportingDocumentType.fetcher("OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://trusthub.twilio.com/v1/SupportingDocumentTypes/OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"fields\": [{\"machine_name\": \"first_name\",\"friendly_name\": \"First Name\",\"constraint\": \"String\"},{\"machine_name\": \"last_name\",\"friendly_name\": \"Last Name\",\"constraint\": \"String\"},{\"machine_name\": \"business_name\",\"friendly_name\": \"Business Name\",\"constraint\": \"String\"}],\"machine_name\": \"government_issued_proof_of_authorized_representative\",\"friendly_name\": \"Government Issued Identity certifying proof of being an authorized representative of a company\",\"sid\": \"OYaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(SupportingDocumentType.fetcher("OYXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }
}