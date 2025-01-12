/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.twilio.twiml.TwiML;
import com.twilio.twiml.TwiMLException;

/**
 * TwiML wrapper for {@code <Stop>}
 */
@JsonDeserialize(builder = Stop.Builder.class)
public class Stop extends TwiML {
    /**
     * For XML Serialization/Deserialization
     */
    private Stop() {
        this(new Builder());
    }

    /**
     * Create a new {@code <Stop>} element
     */
    private Stop(Builder b) {
        super("Stop", b);
    }

    /**
     * Create a new {@code <Stop>} element
     */
    public static class Builder extends TwiML.Builder<Builder> {
        /**
         * Create and return a {@code <Stop.Builder>} from an XML string
         */
        public static Builder fromXml(final String xml) throws TwiMLException {
            try {
                return OBJECT_MAPPER.readValue(xml, Builder.class);
            } catch (final JsonProcessingException jpe) {
                throw new TwiMLException(
                    "Failed to deserialize a Stop.Builder from the provided XML string: " + jpe.getMessage());
            } catch (final Exception e) {
                throw new TwiMLException("Unhandled exception: " + e.getMessage());
            }
        }

        /**
         * Add a child {@code <Stream>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Stream")
        public Builder stream(Stream stream) {
            this.children.add(stream);
            return this;
        }

        /**
         * Add a child {@code <Siprec>} element
         */
        @JacksonXmlProperty(isAttribute = false, localName = "Siprec")
        public Builder siprec(Siprec siprec) {
            this.children.add(siprec);
            return this;
        }

        /**
         * Create and return resulting {@code <Stop>} element
         */
        public Stop build() {
            return new Stop(this);
        }
    }
}