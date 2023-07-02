package com.js.springemployee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {
	
	@ExceptionHandler (value = NoIdFoundException.class)
	public ResponseEntity<ResponseStructer<String>> noIdFound(NoIdFoundException e){
		ResponseStructer<String> res = new ResponseStructer<String>();
		res.setData("Not Found");
		res.setMessage(e.getMessage());
		res.setStatusCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ResponseStructer<String>>(res.http)
	}
}
