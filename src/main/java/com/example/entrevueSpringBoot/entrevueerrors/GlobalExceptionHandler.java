package com.example.entrevueSpringBoot.entrevueerrors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
     
     @ExceptionHandler(value = RuntimeException.class)
     public ResponseEntity<ApiError> handleRuntimeException(RuntimeException e)
     {
           ApiError error = new ApiError();
           error.setException("Runtime Exception: " + e.getMessage());
           HttpStatus status = HttpStatus.NOT_FOUND;
           return new ResponseEntity<>(error, status);
     }
}