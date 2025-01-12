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

public class PoliciesTest {
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
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/Policies");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Policies.reader().read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/Policies?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/Policies?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Policies.reader().read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/Policies?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/Policies?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"},\"results\": [{\"url\": \"https://trusthub.twilio.com/v1/Policies/RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"requirements\": {\"end_user\": [{\"url\": \"/EndUserTypes/customer_profile_business_information\",\"fields\": [\"business_type\",\"business_registration_number\",\"business_name\",\"business_registration_identifier\",\"business_identity\",\"business_industry\",\"website_url\",\"business_regions_of_operation\",\"social_media_profile_urls\"],\"type\": \"customer_profile_business_information\",\"name\": \"Business Information\",\"requirement_name\": \"customer_profile_business_information\"},{\"url\": \"/EndUserTypes/authorized_representative_1\",\"fields\": [\"first_name\",\"last_name\",\"email\",\"phone_number\",\"business_title\",\"job_position\"],\"type\": \"authorized_representative_1\",\"name\": \"Authorized Representative 1\",\"requirement_name\": \"authorized_representative_1\"},{\"url\": \"/EndUserTypes/authorized_representative_2\",\"fields\": [\"first_name\",\"last_name\",\"email\",\"phone_number\",\"business_title\",\"job_position\"],\"type\": \"authorized_representative_2\",\"name\": \"Authorized Representative 2\",\"requirement_name\": \"authorized_representative_2\"}],\"supporting_trust_products\": [],\"supporting_document\": [[{\"description\": \"Customer Profile HQ Physical Address\",\"type\": \"document\",\"name\": \"Physical Business Address\",\"accepted_documents\": [{\"url\": \"/SupportingDocumentTypes/customer_profile_address\",\"fields\": [\"address_sids\"],\"type\": \"customer_profile_address\",\"name\": \"Physical Business Address\"}],\"requirement_name\": \"customer_profile_address\"}]],\"supporting_customer_profiles\": []},\"friendly_name\": \"Primary Customer Profile of type Business\",\"sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Policies.reader().read(tw));
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/Policies/RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Policies.fetcher("RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"url\": \"https://trusthub.twilio.com/v1/Policies/RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"requirements\": {\"end_user\": [{\"url\": \"/EndUserTypes/customer_profile_business_information\",\"fields\": [\"business_type\",\"business_registration_number\",\"business_name\",\"business_registration_identifier\",\"business_identity\",\"business_industry\",\"website_url\",\"business_regions_of_operation\",\"social_media_profile_urls\"],\"type\": \"customer_profile_business_information\",\"name\": \"Business Information\",\"requirement_name\": \"customer_profile_business_information\"},{\"url\": \"/EndUserTypes/authorized_representative_1\",\"fields\": [\"first_name\",\"last_name\",\"email\",\"phone_number\",\"business_title\",\"job_position\"],\"type\": \"authorized_representative_1\",\"name\": \"Authorized Representative 1\",\"requirement_name\": \"authorized_representative_1\"},{\"url\": \"/EndUserTypes/authorized_representative_2\",\"fields\": [\"first_name\",\"last_name\",\"email\",\"phone_number\",\"business_title\",\"job_position\"],\"type\": \"authorized_representative_2\",\"name\": \"Authorized Representative 2\",\"requirement_name\": \"authorized_representative_2\"}],\"supporting_trust_products\": [],\"supporting_document\": [[{\"description\": \"Customer Profile HQ Physical Address\",\"type\": \"document\",\"name\": \"Physical Business Address\",\"accepted_documents\": [{\"url\": \"/SupportingDocumentTypes/customer_profile_address\",\"fields\": [\"address_sids\"],\"type\": \"customer_profile_address\",\"name\": \"Physical Business Address\"}],\"requirement_name\": \"customer_profile_address\"}]],\"supporting_customer_profiles\": []},\"friendly_name\": \"Primary Customer Profile of type Business\",\"sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Policies.fetcher("RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}