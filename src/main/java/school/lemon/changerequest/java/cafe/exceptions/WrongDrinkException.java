package school.lemon.changerequest.java.cafe.exceptions;

public class WrongDrinkException extends ServeException {

    public WrongDrinkException() {
    }

    public WrongDrinkException(String message) {
        super(message);
    }

    public WrongDrinkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongDrinkException(Throwable cause) {
        super(cause);
    }

    public WrongDrinkException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
