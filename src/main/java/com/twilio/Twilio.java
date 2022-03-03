package com.twilio;

/**
 * Singleton class to initialize Twilio environment.
 */
public class Twilio extends TwilioAPI{
    public static final String VERSION = "8.27.0";
    public static final String JAVA_VERSION = System.getProperty("java.version");

    public Twilio(final String username, final String password) {
        super(username, password);
    }
}
