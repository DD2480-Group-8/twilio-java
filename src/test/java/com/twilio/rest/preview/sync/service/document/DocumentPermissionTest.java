/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.preview.sync.service.document;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
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

public class DocumentPermissionTest {
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
                                          Domains.PREVIEW.toString(),
                                          "/Sync/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Documents/ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Permissions/identity");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            DocumentPermission.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity").fetch(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"document_sid\": \"ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"identity\": \"identity\",\"read\": true,\"write\": true,\"manage\": true,\"url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Permissions/identity\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(DocumentPermission.fetcher("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity").fetch(tw));
    }

    @Test
    public void testDeleteRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.DELETE,
                                          Domains.PREVIEW.toString(),
                                          "/Sync/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Documents/ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Permissions/identity");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            DocumentPermission.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity").delete(tw);
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

        DocumentPermission.deleter("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity").delete(tw);
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.PREVIEW.toString(),
                                          "/Sync/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Documents/ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Permissions");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            DocumentPermission.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadEmptyResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"permissions\": [],\"meta\": {\"first_page_url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/sidOrUniqueName/Permissions?PageSize=50&Page=0\",\"key\": \"permissions\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/sidOrUniqueName/Permissions?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(DocumentPermission.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"permissions\": [{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"document_sid\": \"ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"identity\": \"identity\",\"read\": true,\"write\": true,\"manage\": true,\"url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Permissions/identity\"}],\"meta\": {\"first_page_url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/sidOrUniqueName/Permissions?PageSize=50&Page=0\",\"key\": \"permissions\",\"next_page_url\": null,\"page\": 0,\"page_size\": 50,\"previous_page_url\": null,\"url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/sidOrUniqueName/Permissions?PageSize=50&Page=0\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(DocumentPermission.reader("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").read());
    }

    @Test
    public void testUpdateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.PREVIEW.toString(),
                                          "/Sync/Services/ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Documents/ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX/Permissions/identity");
            request.addPostParam("Read", serialize(true));
            request.addPostParam("Write", serialize(true));
            request.addPostParam("Manage", serialize(true));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            DocumentPermission.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", true, true, true).update(tw);
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testUpdateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"service_sid\": \"ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"document_sid\": \"ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"identity\": \"identity\",\"read\": true,\"write\": true,\"manage\": true,\"url\": \"https://preview.twilio.com/Sync/Services/ISaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Documents/ETaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Permissions/identity\"}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        DocumentPermission.updater("ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "ETXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX", "identity", true, true, true).update(tw);
    }
}