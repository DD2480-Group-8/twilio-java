/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1.brandregistration;

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

public class BrandVettingTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Mocked
    private Twilio tw;

    @Before
    public void setUp() throws Exception {
        tw = new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.MESSAGING.toString(),
                                          "/v1/a2p/BrandRegistrations/BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Vettings");
            request.addPostParam("VettingProvider", serialize(BrandVetting.VettingProvider.CAMPAIGN_VERIFY));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            BrandVetting.creator("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", BrandVetting.VettingProvider.CAMPAIGN_VERIFY).create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"AC78e8e67fc0246521490fb9907fd0c165\",\"brand_sid\": \"BN0044409f7e067e279523808d267e2d85\",\"brand_vetting_sid\": \"VT12445353\",\"vetting_provider\": \"campaign-verify\",\"vetting_id\": \"cv|1.0|tcr|10dlc|9975c339-d46f-49b7-a399-EXAMPLETOKEN|GQ3EXAMPLETOKENAXXBUNBT2AgL-LdQuPveFhEyY\",\"vetting_class\": \"POLITICAL\",\"vetting_status\": \"IN_PROGRESS\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:35Z\",\"url\": \"https://messaging.twilio.com/v1/a2p/BrandRegistrations/BN0044409f7e067e279523808d267e2d85/Vettings/VT12445353\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        BrandVetting.creator("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", BrandVetting.VettingProvider.CAMPAIGN_VERIFY).create();
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/a2p/BrandRegistrations/BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Vettings");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            BrandVetting.reader("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://messaging.twilio.com/v1/a2p/BrandRegistrations/BN0044409f7e067e279523808d267e2d85/Vettings?PageSize=50&Page=0\",\"previous_page_url\": null,\"next_page_url\": null,\"key\": \"data\",\"url\": \"https://messaging.twilio.com/v1/a2p/BrandRegistrations/BN0044409f7e067e279523808d267e2d85/Vettings?PageSize=50&Page=0\"},\"data\": [{\"account_sid\": \"AC78e8e67fc0246521490fb9907fd0c165\",\"brand_sid\": \"BN0044409f7e067e279523808d267e2d85\",\"brand_vetting_sid\": \"VT12445353\",\"vetting_provider\": \"campaign-verify\",\"vetting_id\": \"cv|1.0|tcr|10dlc|9975c339-d46f-49b7-a399-EXAMPLETOKEN|GQ3EXAMPLETOKENAXXBUNBT2AgL-LdQuPveFhEyY\",\"vetting_class\": \"POLITICAL\",\"vetting_status\": \"IN_PROGRESS\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:35Z\",\"url\": \"https://messaging.twilio.com/v1/a2p/BrandRegistrations/BN0044409f7e067e279523808d267e2d85/Vettings/VT12445353\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(BrandVetting.reader("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/a2p/BrandRegistrations/BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Vettings/VTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            BrandVetting.fetcher("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "VTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"AC78e8e67fc0246521490fb9907fd0c165\",\"brand_sid\": \"BN0044409f7e067e279523808d267e2d85\",\"brand_vetting_sid\": \"VT12445353\",\"vetting_provider\": \"campaign-verify\",\"vetting_id\": \"cv|1.0|tcr|10dlc|9975c339-d46f-49b7-a399-EXAMPLETOKEN|GQ3EXAMPLETOKENAXXBUNBT2AgL-LdQuPveFhEyY\",\"vetting_class\": \"POLITICAL\",\"vetting_status\": \"IN_PROGRESS\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:35Z\",\"url\": \"https://messaging.twilio.com/v1/a2p/BrandRegistrations/BN0044409f7e067e279523808d267e2d85/Vettings/VT12445353\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(BrandVetting.fetcher("BNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "VTXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }
}