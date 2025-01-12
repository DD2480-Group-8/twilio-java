/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.wireless.v1.sim;

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

public class DataSessionTest {
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
                                          Domains.WIRELESS.toString(),
                                          "/v1/Sims/DEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/DataSessions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            DataSession.reader("DEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"data_sessions\": [{\"sid\": \"WNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sim_sid\": \"DEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"radio_link\": \"LTE\",\"operator_mcc\": \"\",\"operator_mnc\": \"\",\"operator_country\": \"\",\"operator_name\": \"\",\"cell_id\": \"\",\"cell_location_estimate\": {},\"packets_uploaded\": 0,\"packets_downloaded\": 0,\"last_updated\": \"2015-07-30T20:00:00Z\",\"start\": \"2015-07-30T20:00:00Z\",\"end\": null,\"imei\": null},{\"sid\": \"WNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"sim_sid\": \"DEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"radio_link\": \"3G\",\"operator_mcc\": \"\",\"operator_mnc\": \"\",\"operator_country\": \"\",\"operator_name\": \"\",\"cell_id\": \"\",\"cell_location_estimate\": {},\"packets_uploaded\": 0,\"packets_downloaded\": 0,\"last_updated\": \"2015-07-30T20:00:00Z\",\"start\": \"2015-07-30T20:00:00Z\",\"end\": \"2015-07-30T20:00:00Z\",\"imei\": \"014931000129700\"}],\"meta\": {\"first_page_url\": \"https://wireless.twilio.com/v1/Sims/DEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DataSessions?PageSize=50&Page=0\",\"key\": \"data_sessions\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://wireless.twilio.com/v1/Sims/DEaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/DataSessions?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(DataSession.reader("DEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read(tw));
    }
}