package nabil.springsecuritydemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ahmed Nabil
 */
@ResponseStatus(code = HttpStatus.CONFLICT, reason = "Email already taken.")
public class EmailTakenException extends RuntimeException {
}