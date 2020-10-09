/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.video.v1;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
public class CompositionHookReader extends Reader<CompositionHook> {
    private Boolean enabled;
    private ZonedDateTime dateCreatedAfter;
    private ZonedDateTime dateCreatedBefore;
    private String friendlyName;

    /**
     * Read only CompositionHook resources with an `enabled` value that matches this
     * parameter..
     *
     * @param enabled Read only CompositionHook resources with an enabled value
     *                that matches this parameter
     * @return this
     */
    public CompositionHookReader setEnabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Read only CompositionHook resources created on or after this <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> datetime with time
     * zone..
     *
     * @param dateCreatedAfter Read only CompositionHook resources created on or
     *                         after this ISO 8601 datetime with time zone
     * @return this
     */
    public CompositionHookReader setDateCreatedAfter(final ZonedDateTime dateCreatedAfter) {
        this.dateCreatedAfter = dateCreatedAfter;
        return this;
    }

    /**
     * Read only CompositionHook resources created before this <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> datetime with time
     * zone..
     *
     * @param dateCreatedBefore Read only CompositionHook resources created before
     *                          this ISO 8601 datetime with time zone
     * @return this
     */
    public CompositionHookReader setDateCreatedBefore(final ZonedDateTime dateCreatedBefore) {
        this.dateCreatedBefore = dateCreatedBefore;
        return this;
    }

    /**
     * Read only CompositionHook resources with friendly names that match this
     * string. The match is not case sensitive and can include asterisk `*`
     * characters as wildcard match..
     *
     * @param friendlyName Read only CompositionHook resources with friendly names
     *                     that match this string
     * @return this
     */
    public CompositionHookReader setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return CompositionHook ResourceSet
     */
    @Override
    public ResourceSet<CompositionHook> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return CompositionHook ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<CompositionHook> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.VIDEO.toString(),
            "/v1/CompositionHooks"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return CompositionHook ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<CompositionHook> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<CompositionHook> nextPage(final Page<CompositionHook> page,
                                          final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<CompositionHook> previousPage(final Page<CompositionHook> page,
                                              final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.VIDEO.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of CompositionHook Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<CompositionHook> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("CompositionHook read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "composition_hooks",
            response.getContent(),
            CompositionHook.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (enabled != null) {
            request.addQueryParam("Enabled", enabled.toString());
        }

        if (dateCreatedAfter != null) {
            request.addQueryParam("DateCreatedAfter", dateCreatedAfter.toOffsetDateTime().toString());
        }

        if (dateCreatedBefore != null) {
            request.addQueryParam("DateCreatedBefore", dateCreatedBefore.toOffsetDateTime().toString());
        }

        if (friendlyName != null) {
            request.addQueryParam("FriendlyName", friendlyName);
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}