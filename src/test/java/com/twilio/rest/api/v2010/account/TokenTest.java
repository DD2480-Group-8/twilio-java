/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.api.v2010.account;

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

public class TokenTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        new Twilio("AC123", "AUTH TOKEN");
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Tokens.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Token.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"username\": \"dc2d2894d5a9023620c467b0e71cfa6a35457e6679785ed6ae9856fe5bdfa269\",\"ice_servers\": [{\"url\": \"stun:global.stun.twilio.com:3478?transport=udp\",\"urls\": \"stun:global.stun.twilio.com:3478?transport=udp\"},{\"username\": \"dc2d2894d5a9023620c467b0e71cfa6a35457e6679785ed6ae9856fe5bdfa269\",\"credential\": \"tE2DajzSJwnsSbc123\",\"url\": \"turn:global.turn.twilio.com:3478?transport=udp\",\"urls\": \"turn:global.turn.twilio.com:3478?transport=udp\"},{\"username\": \"dc2d2894d5a9023620c467b0e71cfa6a35457e6679785ed6ae9856fe5bdfa269\",\"credential\": \"tE2DajzSJwnsSbc123\",\"url\": \"turn:global.turn.twilio.com:3478?transport=tcp\",\"urls\": \"turn:global.turn.twilio.com:3478?transport=tcp\"},{\"username\": \"dc2d2894d5a9023620c467b0e71cfa6a35457e6679785ed6ae9856fe5bdfa269\",\"credential\": \"tE2DajzSJwnsSbc123\",\"url\": \"turn:global.turn.twilio.com:443?transport=tcp\",\"urls\": \"turn:global.turn.twilio.com:443?transport=tcp\"}],\"date_updated\": \"Fri, 01 May 2020 01:42:57 +0000\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"ttl\": \"86400\",\"date_created\": \"Fri, 01 May 2020 01:42:57 +0000\",\"password\": \"tE2DajzSJwnsSbc123\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Token.creator("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
    }
}