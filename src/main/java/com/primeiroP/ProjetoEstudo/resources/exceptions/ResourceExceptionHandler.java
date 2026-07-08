package com.primeiroP.ProjetoEstudo.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.primeiroP.ProjetoEstudo.services.exceptions.DataBaseException;
import com.primeiroP.ProjetoEstudo.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandarError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
    String error = "resource not found";
    HttpStatus status = HttpStatus.NOT_FOUND;
    StandarError error2 = new StandarError(Instant.now(), status.value(), error, e.getMessage(),
        request.getRequestURI());
    return ResponseEntity.status(status).body(error2);
  }

  @ExceptionHandler(DataBaseException.class)
  public ResponseEntity<StandarError> dataBaseException(DataBaseException e, HttpServletRequest request) {
    String error = "Database error";
    HttpStatus status = HttpStatus.BAD_REQUEST;
    StandarError error2 = new StandarError(Instant.now(), status.value(), error, e.getMessage(),
        request.getRequestURI());
    return ResponseEntity.status(status).body(error2);
  }
}
