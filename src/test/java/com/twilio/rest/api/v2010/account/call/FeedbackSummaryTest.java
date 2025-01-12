/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account.call;

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

public class FeedbackSummaryTest {
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
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Calls/FeedbackSummary.json");
            request.addPostParam("StartDate", serialize(DateConverter.localDateFromString("2008-01-02")));
            request.addPostParam("EndDate", serialize(DateConverter.localDateFromString("2008-01-02")));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FeedbackSummary.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", DateConverter.localDateFromString("2008-01-02"), DateConverter.localDateFromString("2008-01-02")).create(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"include_subaccounts\": false,\"call_feedback_count\": 729,\"quality_score_standard_deviation\": \"1.0\",\"end_date\": \"2014-01-01\",\"quality_score_median\": \"4.0\",\"quality_score_average\": \"4.5\",\"date_updated\": \"Tue, 31 Aug 2010 20:36:28 +0000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"completed\",\"call_count\": 10200,\"sid\": \"FSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Tue, 31 Aug 2010 20:36:28 +0000\",\"start_date\": \"2014-01-01\",\"issues\": [{\"count\": 45,\"description\": \"imperfect-audio\",\"percentage_of_total_calls\": \"0.04%\"}]}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        FeedbackSummary.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", DateConverter.localDateFromString("2008-01-02"), DateConverter.localDateFromString("2008-01-02")).create(tw);
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Calls/FeedbackSummary/FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FeedbackSummary.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"include_subaccounts\": false,\"call_feedback_count\": 729,\"quality_score_standard_deviation\": \"1.0\",\"end_date\": \"2014-01-01\",\"quality_score_median\": \"4.0\",\"quality_score_average\": \"4.5\",\"date_updated\": \"Tue, 31 Aug 2010 20:36:28 +0000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"completed\",\"call_count\": 10200,\"sid\": \"FSaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_created\": \"Tue, 31 Aug 2010 20:36:28 +0000\",\"start_date\": \"2014-01-01\",\"issues\": [{\"count\": 45,\"description\": \"imperfect-audio\",\"percentage_of_total_calls\": \"0.04%\"}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(FeedbackSummary.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Calls/FeedbackSummary/FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            FeedbackSummary.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
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

        FeedbackSummary.deleter("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "FSXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").delete(tw);
    }
}