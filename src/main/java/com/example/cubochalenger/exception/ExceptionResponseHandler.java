package com.example.cubochalenger.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionResponseHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ResponseEntity exceptionHandler(){

        return new ResponseEntity("Error, because something is null",
                HttpStatus.BAD_GATEWAY);
    }

}
