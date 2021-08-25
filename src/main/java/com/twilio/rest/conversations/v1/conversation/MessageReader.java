/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.conversations.v1.conversation;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class MessageReader extends Reader<Message> {
    private final String pathConversationSid;
    private Message.OrderType order;

    /**
     * Construct a new MessageReader.
     *
     * @param pathConversationSid The unique ID of the Conversation for messages.
     */
    public MessageReader(final String pathConversationSid) {
        this.pathConversationSid = pathConversationSid;
    }

    /**
     * The sort order of the returned messages. Can be: `asc` (ascending) or `desc`
     * (descending), with `asc` as the default..
     *
     * @param order The sort order of the returned messages
     * @return this
     */
    public MessageReader setOrder(final Message.OrderType order) {
        this.order = order;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Message ResourceSet
     */
    @Override
    public ResourceSet<Message> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Message ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Message> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.CONVERSATIONS.toString(),
            "/v1/Conversations/" + this.pathConversationSid + "/Messages"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Message ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Message> getPage(final String targetUrl, final TwilioRestClient client) {
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
    public Page<Message> nextPage(final Page<Message> page,
                                  final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.CONVERSATIONS.toString())
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
    public Page<Message> previousPage(final Page<Message> page,
                                      final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.CONVERSATIONS.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Message Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Message> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Message read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "messages",
            response.getContent(),
            Message.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (order != null) {
            request.addQueryParam("Order", order.toString());
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}