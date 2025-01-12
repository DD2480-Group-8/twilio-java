/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.hostedNumbers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
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

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class AuthorizationDocumentTest {
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
                                          Domains.PREVIEW.toString(),
                                          "/HostedNumbers/AuthorizationDocuments/PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthorizationDocument.fetcher("PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"address_sid\": \"AD11111111111111111111111111111111\",\"cc_emails\": [\"aaa@twilio.com\",\"bbb@twilio.com\"],\"date_created\": \"2017-03-28T20:06:39Z\",\"date_updated\": \"2017-03-28T20:06:39Z\",\"email\": \"test@twilio.com\",\"links\": {\"dependent_hosted_number_orders\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DependentHostedNumberOrders\"},\"sid\": \"PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"signing\",\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthorizationDocument.fetcher("PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PREVIEW.toString(),
                                          "/HostedNumbers/AuthorizationDocuments/PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthorizationDocument.updater("PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"address_sid\": \"ADaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"cc_emails\": [\"test1@twilio.com\",\"test2@twilio.com\"],\"date_created\": \"2017-03-28T20:06:39Z\",\"date_updated\": \"2017-03-28T20:06:39Z\",\"email\": \"test+hosted@twilio.com\",\"links\": {\"dependent_hosted_number_orders\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DependentHostedNumberOrders\"},\"sid\": \"PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"signing\",\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AuthorizationDocument.updater("PXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PREVIEW.toString(),
                                          "/HostedNumbers/AuthorizationDocuments");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthorizationDocument.reader().read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments?Status=signed&Email=test%2Bhosted%40twilio.com&PageSize=50&Page=0\",\"key\": \"items\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments?Status=signed&Email=test%2Bhosted%40twilio.com&PageSize=50&Page=0\"},\"items\": []}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthorizationDocument.reader().read(tw));
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"first_page_url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments?PageSize=50&Page=0\",\"key\": \"items\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments?PageSize=50&Page=0\"},\"items\": [{\"address_sid\": \"ADaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"cc_emails\": [\"test1@twilio.com\",\"test2@twilio.com\"],\"date_created\": \"2017-03-28T20:06:39Z\",\"date_updated\": \"2017-03-28T20:06:39Z\",\"email\": \"test+hosted@twilio.com\",\"links\": {\"dependent_hosted_number_orders\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DependentHostedNumberOrders\"},\"sid\": \"PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"signing\",\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(AuthorizationDocument.reader().read(tw));
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PREVIEW.toString(),
                                          "/HostedNumbers/AuthorizationDocuments");
            request.addPostParam("HostedNumberOrderSids", serialize(Promoter.listOfOne("hosted_number_order_sids")));
            request.addPostParam("AddressSid", serialize("ADXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            request.addPostParam("Email", serialize("email"));
            request.addPostParam("ContactTitle", serialize("contact_title"));
            request.addPostParam("ContactPhoneNumber", serialize("contact_phone_number"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            AuthorizationDocument.creator(Promoter.listOfOne("hosted_number_order_sids"), "ADXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "email", "contact_title", "contact_phone_number").create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"address_sid\": \"ADaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"cc_emails\": [\"test1@twilio.com\",\"test2@twilio.com\"],\"date_created\": \"2017-03-28T20:06:39Z\",\"date_updated\": \"2017-03-28T20:06:39Z\",\"email\": \"test+hosted@twilio.com\",\"links\": {\"dependent_hosted_number_orders\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DependentHostedNumberOrders\"},\"sid\": \"PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"signing\",\"url\": \"https://preview.twilio.com/HostedNumbers/AuthorizationDocuments/PXaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        AuthorizationDocument.creator(Promoter.listOfOne("hosted_number_order_sids"), "ADXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "email", "contact_title", "contact_phone_number").create(tw);
    }
}