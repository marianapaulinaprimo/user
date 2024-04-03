package com.unopar.user.services.exceptions;

import com.unopar.user.domain.enumeration.UserErrorEnum;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException notFoundExceptions){

        StandardError standardError = new StandardError();
        standardError.setMessage(notFoundExceptions.getMessage());
        standardError.setStatus(HttpStatus.NOT_FOUND);
        standardError.setTimestamp(LocalDateTime.now());

        return new ResponseEntity<>(standardError, HttpStatus.NOT_FOUND);

    }
}
