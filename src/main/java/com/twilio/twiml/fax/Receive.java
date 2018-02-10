/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.fax;

import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import com.twilio.twiml.TwiML;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * TwiML wrapper for {@code <Receive>}
 */
public class Receive extends TwiML {
    private final URI action;
    private final HttpMethod method;

    /**
     * For XML Serialization/Deserialization
     */
    private Receive() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Receive>} element
     */
    private Receive(Builder b) {
        super("Receive", Collections.<TwiML>emptyList(), b.options);
        this.action = b.action;
        this.method = b.method;
    }

    /**
     * Attributes to set on the generated XML element
     * 
     * @return A Map of attribute keys to values
     */
    protected Map<String, String> getElementAttributes() {
        // Preserve order of attributes
        Map<String, String> attrs = new HashMap<>();

        if (this.getAction() != null) {
            attrs.put("action", this.getAction().toString());
        }
        if (this.getMethod() != null) {
            attrs.put("method", this.getMethod().toString());
        }

        return attrs;
    }

    /**
     * Receive action URL
     * 
     * @return Receive action URL
     */
    public URI getAction() {
        return action;
    }

    /**
     * Receive action URL method
     * 
     * @return Receive action URL method
     */
    public HttpMethod getMethod() {
        return method;
    }

    /**
     * Create a new {@code <Receive>} element
     */
    public static class Builder {
        private URI action;
        private HttpMethod method;
        private Map<String, String> options = new HashMap<>();

        /**
         * Receive action URL
         */
        public Builder action(URI action) {
            this.action = action;
            return this;
        }

        /**
         * Receive action URL
         */
        public Builder action(String action) {
            this.action = Promoter.uriFromString(action);
            return this;
        }

        /**
         * Receive action URL method
         */
        public Builder method(HttpMethod method) {
            this.method = method;
            return this;
        }

        /**
         * Set additional attributes on this TwiML element that will appear in generated
         * XML.
         */
        public Builder option(String key, String value) {
            this.options.put(key, value);
            return this;
        }

        /**
         * Create and return resulting {@code <Receive>} element
         */
        public Receive build() {
            return new Receive(this);
        }
    }
}