package pl.karolmic.controller.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.security.InvalidParameterException;

@ControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InvalidParameterException.class)
    public final ResponseEntity<String> handleAllExceptions(InvalidParameterException ex) {
        ResponseEntity<String> response = new ResponseEntity<>("Name parameter cannot be empty!!!", HttpStatus.BAD_REQUEST);
        return response;
    }

}
