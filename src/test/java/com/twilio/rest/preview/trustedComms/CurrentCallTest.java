/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.trustedComms;

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

public class CurrentCallTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PREVIEW.toString(),
                                          "/TrustedComms/CurrentCall");
            request.addHeaderParam("X-Xcnam-Sensitive-Phone-Number-From", serialize("x_xcnam_sensitive_phone_number_from"));
            request.addHeaderParam("X-Xcnam-Sensitive-Phone-Number-To", serialize("x_xcnam_sensitive_phone_number_to"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            CurrentCall.fetcher().setXXcnamSensitivePhoneNumberFrom("x_xcnam_sensitive_phone_number_from").setXXcnamSensitivePhoneNumberTo("x_xcnam_sensitive_phone_number_to").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFoundResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"bg_color\": \"#fff\",\"caller\": \"Owl Bank\",\"created_at\": \"2019-05-01T20:00:00Z\",\"font_color\": \"#f22f46\",\"from\": \"+1500123\",\"logo\": \"https://www.twilio.com/marketing/bundles/company/img/logos/red/twilio-logo-red.png\",\"manager\": \"Twilio\",\"reason\": \"Hello Jhon, your bank appointment has been confirmed.\",\"shield_img\": \"https://www.twilio.com/marketing/bundles/company/img/badges/red/twilio-badge-red.png\",\"sid\": \"CQaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"ringing\",\"to\": \"+1500456\",\"url\": \"https://preview.twilio.com/TrustedComms/CurrentCall\",\"use_case\": \"conversational\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(CurrentCall.fetcher().setXXcnamSensitivePhoneNumberFrom("x_xcnam_sensitive_phone_number_from").setXXcnamSensitivePhoneNumberTo("x_xcnam_sensitive_phone_number_to").fetch());
    }
}