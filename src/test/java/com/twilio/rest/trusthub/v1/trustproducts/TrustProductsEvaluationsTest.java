/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.trusthub.v1.trustproducts;

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

public class TrustProductsEvaluationsTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/TrustProducts/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Evaluations");
            request.addPostParam("PolicySid", serialize("RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TrustProductsEvaluations.creator("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"policy_sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"trust_product_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"noncompliant\",\"date_created\": \"2020-04-28T18:14:01Z\",\"url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations/ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": [{\"friendly_name\": \"Business\",\"object_type\": \"business\",\"passed\": false,\"failure_reason\": \"A Business End-User is missing. Please add one to the regulatory bundle.\",\"error_code\": 22214,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Please enter in a Business Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Business Registration Number\",\"object_field\": \"business_registration_number\",\"failure_reason\": \"The Business Registration Number is missing. Please enter in a Business Registration Number on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Please enter in a First Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Please enter in a Last Name on the Business information.\",\"error_code\": 22215}],\"requirement_friendly_name\": \"Business\",\"requirement_name\": \"business_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Or, it does not match the Business Name you entered within Business information. Please enter in the Business Name shown on the Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative or make sure both Business Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Name\",\"requirement_name\": \"business_name_info\"},{\"friendly_name\": \"Excerpt from the commercial register showing French address\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register showing French address is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Address sid(s)\",\"object_field\": \"address_sids\",\"failure_reason\": \"The Address is missing. Please enter in the address shown on the Excerpt from the commercial register showing French address.\",\"error_code\": 22219}],\"requirement_friendly_name\": \"Business Address (Proof of Address)\",\"requirement_name\": \"business_address_proof_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis)\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Document Number\",\"object_field\": \"document_number\",\"failure_reason\": \"The Document Number is missing. Please enter in the Document Number shown on the Excerpt from the commercial register (Extrait K-bis).\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Registration Number\",\"requirement_name\": \"business_reg_no_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Or, it does not match the First Name you entered within Business information. Please enter in the First Name shown on the Government-issued ID or make sure both First Name fields use the same exact inputs.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Or, it does not match the Last Name you entered within Business information. Please enter in the Last Name shown on the Government-issued ID or make sure both Last Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Authorized Representative\",\"requirement_name\": \"name_of_auth_rep_info\"},{\"friendly_name\": \"Executed Copy of Power of Attorney\",\"object_type\": \"power_of_attorney\",\"passed\": false,\"failure_reason\": \"An Executed Copy of Power of Attorney is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [],\"requirement_friendly_name\": \"Power of Attorney\",\"requirement_name\": \"power_of_attorney_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing on the Governnment-Issued ID.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing on the Government-issued ID\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Person granted the Power of Attorney\",\"requirement_name\": \"name_in_power_of_attorney_info\"}]}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        TrustProductsEvaluations.creator("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "RNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/TrustProducts/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Evaluations");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TrustProductsEvaluations.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TrustProductsEvaluations.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"results\": [{\"sid\": \"ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"policy_sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"trust_product_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"noncompliant\",\"date_created\": \"2020-04-28T18:14:01Z\",\"url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations/ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": [{\"friendly_name\": \"Business\",\"object_type\": \"business\",\"passed\": false,\"failure_reason\": \"A Business End-User is missing. Please add one to the regulatory bundle.\",\"error_code\": 22214,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Please enter in a Business Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Business Registration Number\",\"object_field\": \"business_registration_number\",\"failure_reason\": \"The Business Registration Number is missing. Please enter in a Business Registration Number on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Please enter in a First Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Please enter in a Last Name on the Business information.\",\"error_code\": 22215}],\"requirement_friendly_name\": \"Business\",\"requirement_name\": \"business_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Or, it does not match the Business Name you entered within Business information. Please enter in the Business Name shown on the Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative or make sure both Business Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Name\",\"requirement_name\": \"business_name_info\"},{\"friendly_name\": \"Excerpt from the commercial register showing French address\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register showing French address is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Address sid(s)\",\"object_field\": \"address_sids\",\"failure_reason\": \"The Address is missing. Please enter in the address shown on the Excerpt from the commercial register showing French address.\",\"error_code\": 22219}],\"requirement_friendly_name\": \"Business Address (Proof of Address)\",\"requirement_name\": \"business_address_proof_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis)\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Document Number\",\"object_field\": \"document_number\",\"failure_reason\": \"The Document Number is missing. Please enter in the Document Number shown on the Excerpt from the commercial register (Extrait K-bis).\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Registration Number\",\"requirement_name\": \"business_reg_no_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Or, it does not match the First Name you entered within Business information. Please enter in the First Name shown on the Government-issued ID or make sure both First Name fields use the same exact inputs.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Or, it does not match the Last Name you entered within Business information. Please enter in the Last Name shown on the Government-issued ID or make sure both Last Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Authorized Representative\",\"requirement_name\": \"name_of_auth_rep_info\"},{\"friendly_name\": \"Executed Copy of Power of Attorney\",\"object_type\": \"power_of_attorney\",\"passed\": false,\"failure_reason\": \"An Executed Copy of Power of Attorney is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [],\"requirement_friendly_name\": \"Power of Attorney\",\"requirement_name\": \"power_of_attorney_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing on the Governnment-Issued ID.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing on the Government-issued ID\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Person granted the Power of Attorney\",\"requirement_name\": \"name_in_power_of_attorney_info\"}]}],\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations?PageSize=50&Page=0\",\"previous_page_url\": null,\"url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations?PageSize=50&Page=0\",\"next_page_url\": null,\"key\": \"results\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TrustProductsEvaluations.reader("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.TRUSTHUB.toString(),
                                          "/v1/TrustProducts/BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Evaluations/ELXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TrustProductsEvaluations.fetcher("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ELXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"policy_sid\": \"RNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"trust_product_sid\": \"BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"noncompliant\",\"date_created\": \"2020-04-28T18:14:01Z\",\"url\": \"https://trusthub.twilio.com/v1/TrustProducts/BUaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Evaluations/ELaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"results\": [{\"friendly_name\": \"Business\",\"object_type\": \"business\",\"passed\": false,\"failure_reason\": \"A Business End-User is missing. Please add one to the regulatory bundle.\",\"error_code\": 22214,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Please enter in a Business Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Business Registration Number\",\"object_field\": \"business_registration_number\",\"failure_reason\": \"The Business Registration Number is missing. Please enter in a Business Registration Number on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Please enter in a First Name on the Business information.\",\"error_code\": 22215},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Please enter in a Last Name on the Business information.\",\"error_code\": 22215}],\"requirement_friendly_name\": \"Business\",\"requirement_name\": \"business_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Business Name\",\"object_field\": \"business_name\",\"failure_reason\": \"The Business Name is missing. Or, it does not match the Business Name you entered within Business information. Please enter in the Business Name shown on the Excerpt from the commercial register (Extrait K-bis) showing name of Authorized Representative or make sure both Business Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Name\",\"requirement_name\": \"business_name_info\"},{\"friendly_name\": \"Excerpt from the commercial register showing French address\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register showing French address is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Address sid(s)\",\"object_field\": \"address_sids\",\"failure_reason\": \"The Address is missing. Please enter in the address shown on the Excerpt from the commercial register showing French address.\",\"error_code\": 22219}],\"requirement_friendly_name\": \"Business Address (Proof of Address)\",\"requirement_name\": \"business_address_proof_info\"},{\"friendly_name\": \"Excerpt from the commercial register (Extrait K-bis)\",\"object_type\": \"commercial_registrar_excerpt\",\"passed\": false,\"failure_reason\": \"An Excerpt from the commercial register (Extrait K-bis) is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"Document Number\",\"object_field\": \"document_number\",\"failure_reason\": \"The Document Number is missing. Please enter in the Document Number shown on the Excerpt from the commercial register (Extrait K-bis).\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Business Registration Number\",\"requirement_name\": \"business_reg_no_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing. Or, it does not match the First Name you entered within Business information. Please enter in the First Name shown on the Government-issued ID or make sure both First Name fields use the same exact inputs.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing. Or, it does not match the Last Name you entered within Business information. Please enter in the Last Name shown on the Government-issued ID or make sure both Last Name fields use the same exact inputs.\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Authorized Representative\",\"requirement_name\": \"name_of_auth_rep_info\"},{\"friendly_name\": \"Executed Copy of Power of Attorney\",\"object_type\": \"power_of_attorney\",\"passed\": false,\"failure_reason\": \"An Executed Copy of Power of Attorney is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [],\"requirement_friendly_name\": \"Power of Attorney\",\"requirement_name\": \"power_of_attorney_info\"},{\"friendly_name\": \"Government-issued ID\",\"object_type\": \"government_issued_document\",\"passed\": false,\"failure_reason\": \"A Government-issued ID is missing. Please add one to the regulatory bundle.\",\"error_code\": 22216,\"valid\": [],\"invalid\": [{\"friendly_name\": \"First Name\",\"object_field\": \"first_name\",\"failure_reason\": \"The First Name is missing on the Governnment-Issued ID.\",\"error_code\": 22217},{\"friendly_name\": \"Last Name\",\"object_field\": \"last_name\",\"failure_reason\": \"The Last Name is missing on the Government-issued ID\",\"error_code\": 22217}],\"requirement_friendly_name\": \"Name of Person granted the Power of Attorney\",\"requirement_name\": \"name_in_power_of_attorney_info\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TrustProductsEvaluations.fetcher("BUXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ELXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }
}