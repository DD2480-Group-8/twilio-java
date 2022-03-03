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

public class ConferenceTest {
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
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conference.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchValidMixerZoneResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Fri, 18 Feb 2011 19:26:50 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 19:27:33 +0000\",\"friendly_name\": \"AHH YEAH\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"region\": \"us1\",\"status\": \"completed\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": \"last-participant-left\",\"call_sid_ending_conference\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testFetchValidRegionInProgressResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Fri, 18 Feb 2011 19:26:50 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 19:27:33 +0000\",\"friendly_name\": \"AHH YEAH\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"region\": \"au1\",\"status\": \"in-progress\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testFetchWithoutMixerZoneIntegerStatusResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Fri, 18 Feb 2011 19:26:50 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 19:27:33 +0000\",\"friendly_name\": \"AHH YEAH\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"region\": \"us1\",\"status\": \"completed\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": \"participant-with-end-conference-on-exit-left\",\"call_sid_ending_conference\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testFetchUnknownMixerZoneInitIntegerStatusResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Fri, 18 Feb 2011 19:26:50 +0000\",\"date_updated\": \"Fri, 18 Feb 2011 19:27:33 +0000\",\"friendly_name\": \"AHH YEAH\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"region\": \"unknown\",\"status\": \"init\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": \"participant-with-end-conference-on-exit-left\",\"call_sid_ending_conference\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.fetcher("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=init&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=50&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=init&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=50&Page=0\",\"page\": 0,\"page_size\": 50,\"start\": 0,\"end\": 0}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadNextResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFdddddddddddddddddddddddddddddddd\",\"date_updated\": \"Thu, 01 Jan 2015 10:23:45 +0000\",\"date_created\": \"Thu, 01 Jan 2015 10:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFdddddddddddddddddddddddddddddddd/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFdddddddddddddddddddddddddddddddd/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFdddddddddddddddddddddddddddddddd.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"unknown\",\"sid\": \"CFeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee\",\"date_updated\": \"Thu, 01 Jan 2015 09:23:45 +0000\",\"date_created\": \"Thu, 01 Jan 2015 09:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"us1\",\"sid\": \"CFffffffffffffffffffffffffffffffff\",\"date_updated\": \"Thu, 01 Jan 2015 08:23:45 +0000\",\"date_created\": \"Thu, 01 Jan 2015 08:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFffffffffffffffffffffffffffffffff/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFffffffffffffffffffffffffffffffff/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFffffffffffffffffffffffffffffffff.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=3&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=3&Page=0&PageToken=PBCFdddddddddddddddddddddddddddddddd\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=3&Page=1&PageToken=PACFcccccccccccccccccccccccccccccccc\",\"page\": 1,\"page_size\": 3,\"start\": 3,\"end\": 5}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadPreviousResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"Sat, 03 Jan 2015 11:23:45 +0000\",\"date_created\": \"Sat, 03 Jan 2015 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"unknown\",\"sid\": \"CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"date_updated\": \"Fri, 02 Jan 2015 11:23:45 +0000\",\"date_created\": \"Fri, 02 Jan 2015 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"us1\",\"sid\": \"CFcccccccccccccccccccccccccccccccc\",\"date_updated\": \"Thu, 01 Jan 2015 11:23:45 +0000\",\"date_created\": \"Thu, 01 Jan 2015 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=3&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateUpdated%3E=2018-11-12&DateUpdated%3C=2018-11-11&DateCreated=2008-01-03&FriendlyName=friendly_name&DateUpdated=2018-11-13&DateCreated%3C=2008-01-01&DateCreated%3E=2008-01-02&PageSize=3&Page=0&PageToken=PBCFdddddddddddddddddddddddddddddddd\",\"page\": 0,\"page_size\": 3,\"start\": 0,\"end\": 2}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadMyroomResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"Sun, 03 Jan 2021 11:23:45 +0000\",\"date_created\": \"Sun, 03 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"completed\",\"region\": \"us1\",\"sid\": \"CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"date_updated\": \"Sat, 02 Jan 2021 11:23:45 +0000\",\"date_created\": \"Sat, 02 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": \"last-participant-left\",\"call_sid_ending_conference\": \"CAbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\"},{\"status\": \"completed\",\"region\": \"ie1\",\"sid\": \"CFcccccccccccccccccccccccccccccccc\",\"date_updated\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"date_created\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": \"last-participant-left\",\"call_sid_ending_conference\": \"CAcccccccccccccccccccccccccccccccc\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?FriendlyName=MyRoom&PageSize=20&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?FriendlyName=MyRoom&PageSize=20&Page=0\",\"page\": 0,\"page_size\": 20,\"start\": 0,\"end\": 2}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"Fri, 03 Jul 2020 11:23:45 +0000\",\"date_created\": \"Fri, 03 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"de1\",\"sid\": \"CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"date_updated\": \"Thu, 02 Jul 2020 11:23:45 +0000\",\"date_created\": \"Thu, 02 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"completed\",\"region\": \"br1\",\"sid\": \"CFcccccccccccccccccccccccccccccccc\",\"date_updated\": \"Wed, 01 Jul 2020 11:23:45 +0000\",\"date_created\": \"Wed, 01 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Recordings.json\"},\"friendly_name\": \"FRIEND\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": \"participant-with-end-conference-on-exit-left\",\"call_sid_ending_conference\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?PageSize=3&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?PageSize=3&Page=0\",\"page\": 0,\"page_size\": 3,\"start\": 0,\"end\": 2}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadDateCreatedEqualsResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"date_created\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"de1\",\"sid\": \"CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"date_updated\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"date_created\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"completed\",\"region\": \"br1\",\"sid\": \"CFcccccccccccccccccccccccccccccccc\",\"date_updated\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"date_created\": \"Tue, 07 Jul 2020 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Recordings.json\"},\"friendly_name\": \"FRIEND\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": \"participant-with-end-conference-on-exit-left\",\"call_sid_ending_conference\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?DateCreated=2020-07-07&PageSize=3&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?DateCreated=2020-07-07&PageSize=3&Page=0\",\"page\": 0,\"page_size\": 3,\"start\": 0,\"end\": 2}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadDateCreatedOnOrAfterResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conferences\": [{\"status\": \"in-progress\",\"region\": \"jp1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"date_updated\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"date_created\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"friendly_name\": \"friendly_name\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"de1\",\"sid\": \"CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb\",\"date_updated\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"date_created\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb/Recordings.json\"},\"friendly_name\": \"MyRoom\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null},{\"status\": \"in-progress\",\"region\": \"br1\",\"sid\": \"CFcccccccccccccccccccccccccccccccc\",\"date_updated\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"date_created\": \"Fri, 01 Jan 2021 11:23:45 +0000\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc/Recordings.json\"},\"friendly_name\": \"FRIEND\",\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFcccccccccccccccccccccccccccccccc.json\",\"api_version\": \"2010-04-01\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null}],\"first_page_uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateCreated%3E=2021-01-01&PageSize=20&Page=0\",\"next_page_uri\": null,\"previous_page_uri\": null,\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences.json?Status=in-progress&DateCreated%3E=2021-01-01&PageSize=20&Page=0\",\"page\": 0,\"page_size\": 20,\"start\": 0,\"end\": 2}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.API.toString(),
                                          "/2010-04-01/Accounts/ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.json");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conference.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateEndConferenceResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Mon, 22 Aug 2011 20:58:45 +0000\",\"date_updated\": \"Mon, 22 Aug 2011 20:58:46 +0000\",\"friendly_name\": null,\"region\": \"us1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"completed\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": \"conference-ended-via-api\",\"call_sid_ending_conference\": null}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Conference.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }

    @Test
    public void testAnnounceToConferenceResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"api_version\": \"2010-04-01\",\"date_created\": \"Mon, 08 Feb 2021 20:58:45 +0000\",\"date_updated\": \"Mon, 08 Feb 2021 20:58:46 +0000\",\"friendly_name\": \"MyRoom\",\"region\": \"us1\",\"sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"in-progress\",\"subresource_uris\": {\"participants\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants.json\",\"recordings\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Recordings.json\"},\"uri\": \"/2010-04-01/Accounts/ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.json\",\"reason_conference_ended\": null,\"call_sid_ending_conference\": null}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        Conference.updater("ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").update();
    }
}