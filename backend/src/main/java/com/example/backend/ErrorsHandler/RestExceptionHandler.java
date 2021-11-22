package com.example.backend.ErrorsHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.backend.exceptions.EntityNotFoundException;
import com.example.backend.exceptions.InvalidEntityException;
@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(EntityNotFoundException.class)
	  public ResponseEntity<ErrorCode> handleException(EntityNotFoundException exception, WebRequest webRequest) {

	    final HttpStatus notFound = HttpStatus.NOT_FOUND;
	    final ErrorCode errorCode = ErrorCode.builder()
	        .code(exception.getErrorCode())
	        .httpCode(notFound.value())
	        .message(exception.getMessage())
	        .build();

	    return new ResponseEntity<>(errorCode, notFound);
	  }
	@ExceptionHandler(InvalidEntityException.class)
	  public ResponseEntity<ErrorCode> handleException(InvalidEntityException exception, WebRequest webRequest) {
	    final HttpStatus badRequest = HttpStatus.BAD_REQUEST;

	    final ErrorCode errorDto = ErrorCode.builder()
	        .code(exception.getErrorCode())
	        .httpCode(badRequest.value())
	        .message(exception.getMessage())
	        .errors(exception.getErrors())
	        .build();

	    return new ResponseEntity<>(errorDto, badRequest);
	  }
}
