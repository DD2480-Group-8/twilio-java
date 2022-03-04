/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.pricing.v2;

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

public class NumberTest {
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
                                          Domains.PRICING.toString(),
                                          "/v2/Trunking/Numbers/%2B15017122661");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Number.fetcher(new com.twilio.type.PhoneNumber("+15017122661")).fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"country\": \"United States\",\"destination_number\": \"+18001234567\",\"originating_call_price\": {\"base_price\": null,\"current_price\": null,\"number_type\": null},\"iso_country\": \"US\",\"origination_number\": null,\"terminating_prefix_prices\": [{\"base_price\": null,\"current_price\": \"0.013\",\"destination_prefixes\": [\"1800\"],\"friendly_name\": \"Trunking Outbound Minute - United States Zone 1b\",\"origination_prefixes\": [\"ALL\"]}],\"price_unit\": \"USD\",\"url\": \"https://pricing.twilio.com/v2/Trunking/Numbers/+18001234567\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Number.fetcher(new com.twilio.type.PhoneNumber("+15017122661")).fetch());
    }

    @Test
    public void testFetchWithOriginationResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"country\": \"United States\",\"destination_number\": \"+18001234567\",\"originating_call_price\": {\"base_price\": null,\"current_price\": \"0.013\",\"number_type\": \"tollfree\"},\"iso_country\": \"US\",\"origination_number\": \"+15105556789\",\"terminating_prefix_prices\": [{\"base_price\": null,\"current_price\": \"0.001\",\"destination_prefixes\": [\"1800\"],\"friendly_name\": \"Trunking Outbound Minute - United States - Toll Free\",\"origination_prefixes\": [\"ALL\"]}],\"price_unit\": \"USD\",\"url\": \"https://pricing.twilio.com/v2/Trunking/Numbers/+18001234567\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Number.fetcher(new com.twilio.type.PhoneNumber("+15017122661")).fetch());
    }
}