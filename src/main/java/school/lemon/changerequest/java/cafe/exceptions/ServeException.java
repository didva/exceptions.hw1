package school.lemon.changerequest.java.cafe.exceptions;

public class ServeException extends RuntimeException {

    public ServeException() {
    }

    public ServeException(String message) {
        super(message);
    }

    public ServeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServeException(Throwable cause) {
        super(cause);
    }

    public ServeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
