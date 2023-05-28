package nabil.springsecuritydemo.exceptions;

/**
 * @author Ahmed Nabil
 */
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException() {
        super("User Not Found!");
    }

    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserNotFoundException(Throwable cause) {
        super(cause);
    }

    protected UserNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}