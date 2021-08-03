package com.retailstore.bill.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RetailStoreControllerAdvice extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		ExceptionResponse res = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

		ex.printStackTrace();
		return new ResponseEntity<Object>(res, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
