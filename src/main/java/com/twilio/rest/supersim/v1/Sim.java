/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.supersim.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import org.joda.time.DateTime;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Map;
import java.util.Objects;

/**
 * PLEASE NOTE that this class contains preview products that are subject to
 * change. Use them with caution. If you currently do not have developer preview
 * access, please contact help@twilio.com.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sim extends Resource {
    private static final long serialVersionUID = 267800275352549L;

    public enum Status {
        NEW("new"),
        READY("ready"),
        ACTIVE("active"),
        SUSPENDED("suspended"),
        DEACTIVATED("deactivated"),
        INACTIVE("inactive"),
        CANCELED("canceled"),
        SCHEDULED("scheduled");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a Status from a string.
         * @param value string value
         * @return generated Status
         */
        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }

    public enum StatusUpdate {
        ACTIVE("active"),
        SUSPENDED("suspended"),
        DEACTIVATED("deactivated"),
        INACTIVE("inactive");

        private final String value;

        private StatusUpdate(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        /**
         * Generate a StatusUpdate from a string.
         * @param value string value
         * @return generated StatusUpdate
         */
        @JsonCreator
        public static StatusUpdate forValue(final String value) {
            return Promoter.enumFromString(value, StatusUpdate.values());
        }
    }

    /**
     * Create a SimFetcher to execute fetch.
     *
     * @param pathSid The SID that identifies the resource to fetch
     * @return SimFetcher capable of executing the fetch
     */
    public static SimFetcher fetcher(final String pathSid) {
        return new SimFetcher(pathSid);
    }

    /**
     * Create a SimUpdater to execute update.
     *
     * @param pathSid The SID that identifies the resource to update
     * @return SimUpdater capable of executing the update
     */
    public static SimUpdater updater(final String pathSid) {
        return new SimUpdater(pathSid);
    }

    /**
     * Create a SimReader to execute read.
     *
     * @return SimReader capable of executing the read
     */
    public static SimReader reader() {
        return new SimReader();
    }

    /**
     * Converts a JSON String into a Sim object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return Sim object represented by the provided JSON
     */
    public static Sim fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a Sim object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return Sim object represented by the provided JSON
     */
    public static Sim fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, Sim.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String uniqueName;
    private final String accountSid;
    private final String iccid;
    private final Sim.Status status;
    private final String fleetSid;
    private final DateTime dateCreated;
    private final DateTime dateUpdated;
    private final URI url;

    @JsonCreator
    private Sim(@JsonProperty("sid")
                final String sid,
                @JsonProperty("unique_name")
                final String uniqueName,
                @JsonProperty("account_sid")
                final String accountSid,
                @JsonProperty("iccid")
                final String iccid,
                @JsonProperty("status")
                final Sim.Status status,
                @JsonProperty("fleet_sid")
                final String fleetSid,
                @JsonProperty("date_created")
                final String dateCreated,
                @JsonProperty("date_updated")
                final String dateUpdated,
                @JsonProperty("url")
                final URI url) {
        this.sid = sid;
        this.uniqueName = uniqueName;
        this.accountSid = accountSid;
        this.iccid = iccid;
        this.status = status;
        this.fleetSid = fleetSid;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
    }

    /**
     * Returns The unique string that identifies the resource.
     *
     * @return The unique string that identifies the resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns An application-defined string that uniquely identifies the resource.
     *
     * @return An application-defined string that uniquely identifies the resource
     */
    public final String getUniqueName() {
        return this.uniqueName;
    }

    /**
     * Returns The SID of the Account that the Super SIM belongs to.
     *
     * @return The SID of the Account that the Super SIM belongs to
     */
    public final String getAccountSid() {
        return this.accountSid;
    }

    /**
     * Returns The ICCID associated with the SIM.
     *
     * @return The ICCID associated with the SIM
     */
    public final String getIccid() {
        return this.iccid;
    }

    /**
     * Returns The status of the Super SIM.
     *
     * @return The status of the Super SIM
     */
    public final Sim.Status getStatus() {
        return this.status;
    }

    /**
     * Returns The unique ID of the Fleet configured for this SIM.
     *
     * @return The unique ID of the Fleet configured for this SIM
     */
    public final String getFleetSid() {
        return this.fleetSid;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was created.
     *
     * @return The ISO 8601 date and time in GMT when the resource was created
     */
    public final DateTime getDateCreated() {
        return this.dateCreated;
    }

    /**
     * Returns The ISO 8601 date and time in GMT when the resource was last updated.
     *
     * @return The ISO 8601 date and time in GMT when the resource was last updated
     */
    public final DateTime getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * Returns The absolute URL of the Sim Resource.
     *
     * @return The absolute URL of the Sim Resource
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Sim other = (Sim) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(uniqueName, other.uniqueName) &&
               Objects.equals(accountSid, other.accountSid) &&
               Objects.equals(iccid, other.iccid) &&
               Objects.equals(status, other.status) &&
               Objects.equals(fleetSid, other.fleetSid) &&
               Objects.equals(dateCreated, other.dateCreated) &&
               Objects.equals(dateUpdated, other.dateUpdated) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            uniqueName,
                            accountSid,
                            iccid,
                            status,
                            fleetSid,
                            dateCreated,
                            dateUpdated,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("uniqueName", uniqueName)
                          .add("accountSid", accountSid)
                          .add("iccid", iccid)
                          .add("status", status)
                          .add("fleetSid", fleetSid)
                          .add("dateCreated", dateCreated)
                          .add("dateUpdated", dateUpdated)
                          .add("url", url)
                          .toString();
    }
}