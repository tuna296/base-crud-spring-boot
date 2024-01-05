package com.example.basecrudspringboot.controller.advice;

import com.example.basecrudspringboot.exception.base.BaseException;
import com.example.basecrudspringboot.exception.base.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public ResponseEntity<Map<String, Object>> handleNotFoundException(NotFoundException ex) {
    Map<String, Object> response = new HashMap<>();
    response.put("message", ex.getMessage());
    response.put("status", HttpStatus.NOT_FOUND.value());

    return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(BaseException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public ResponseEntity<Map<String, Object>> handleBaseException(BaseException ex) {
    Map<String, Object> response = new HashMap<>();
    response.put("message", ex.getMessage());
    response.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());

    return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}