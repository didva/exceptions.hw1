package school.lemon.changerequest.java.cafe.exceptions;

public class TooColdException extends WrongTemperatureException {

    public TooColdException() {
    }

    public TooColdException(String message) {
        super(message);
    }

    public TooColdException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooColdException(Throwable cause) {
        super(cause);
    }

    public TooColdException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
