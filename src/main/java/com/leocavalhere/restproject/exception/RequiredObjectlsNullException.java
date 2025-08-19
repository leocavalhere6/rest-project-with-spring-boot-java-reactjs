package com.leocavalhere.restproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class RequiredObjectlsNullException extends RuntimeException {
  public RequiredObjectlsNullException() {
    super("It is not allowed to persist a null object!");
  }

  public RequiredObjectlsNullException(String message) {
    super(message);
  }
  
}