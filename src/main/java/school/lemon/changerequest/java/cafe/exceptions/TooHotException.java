package school.lemon.changerequest.java.cafe.exceptions;

public class TooHotException extends WrongTemperatureException{

    public TooHotException() {
    }

    public TooHotException(String message) {
        super(message);
    }

    public TooHotException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooHotException(Throwable cause) {
        super(cause);
    }

    public TooHotException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
