package org.rjung.util;

/**
 * It's not likely to get an exception. This will include any other Exception
 * that occurred within the generation of the URL.
 */
public class GravatarException extends Exception {

    private static final long serialVersionUID = 4490273872457279555L;

    public GravatarException() {
        super();
    }

    public GravatarException(String message) {
        super(message);
    }

    public GravatarException(String message, Throwable cause) {
        super(message, cause);
    }

    public GravatarException(Throwable cause) {
        super(cause);
    }

}
