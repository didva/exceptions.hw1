package school.lemon.changerequest.java.cafe.exceptions;

public class WrongTemperatureException extends ServeException {

    public WrongTemperatureException() {
    }

    public WrongTemperatureException(String message) {
        super(message);
    }

    public WrongTemperatureException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongTemperatureException(Throwable cause) {
        super(cause);
    }

    public WrongTemperatureException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
