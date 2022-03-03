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

public class CountryTest {
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
                                          Domains.PRICING.toString(),
                                          "/v2/Trunking/Countries");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Country.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"countries\": [{\"country\": \"Andorra\",\"iso_country\": \"AD\",\"url\": \"https://pricing.twilio.com/v2/Trunking/Countries/AD\"}],\"meta\": {\"first_page_url\": \"https://pricing.twilio.com/v2/Trunking/Countries?PageSize=50&Page=0\",\"key\": \"countries\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://pricing.twilio.com/v2/Trunking/Countries?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Country.reader().read());
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"countries\": [],\"meta\": {\"first_page_url\": \"https://pricing.twilio.com/v2/Trunking/Countries?PageSize=50&Page=0\",\"key\": \"countries\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://pricing.twilio.com/v2/Trunking/Countries?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Country.reader().read());
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PRICING.toString(),
                                          "/v2/Trunking/Countries/US");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Country.fetcher("US").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"country\": \"United States\",\"originating_call_prices\": [{\"base_price\": null,\"current_price\": \"0.0085\",\"number_type\": \"local\"},{\"base_price\": null,\"current_price\": \"0.022\",\"number_type\": \"toll free\"}],\"iso_country\": \"US\",\"terminating_prefix_prices\": [{\"base_price\": null,\"current_price\": \"0.090\",\"destination_prefixes\": [\"1907\"],\"friendly_name\": \"Outbound Trunking Minute - United States - Alaska\",\"origination_prefixes\": [\"ALL\"]},{\"base_price\": null,\"current_price\": \"0.013\",\"destination_prefixes\": [\"1808\"],\"friendly_name\": \"Outbound Trunking Minute - United States - Hawaii\",\"origination_prefixes\": [\"ALL\"]},{\"base_price\": null,\"current_price\": \"0.013\",\"destination_prefixes\": [\"1800\",\"1844\",\"1855\",\"1866\",\"1877\",\"1888\"],\"friendly_name\": \"Outbound Trunking Minute - United States & Canada - Toll Free\",\"origination_prefixes\": [\"ALL\"]},{\"base_price\": null,\"current_price\": \"0.013\",\"destination_prefixes\": [\"1\"],\"friendly_name\": \"Outbound Trunking Minute - United States & Canada\",\"origination_prefixes\": [\"ALL\"]}],\"price_unit\": \"USD\",\"url\": \"https://pricing.twilio.com/v2/Trunking/Countries/US\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Country.fetcher("US").fetch());
    }
}