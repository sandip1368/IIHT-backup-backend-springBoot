package com.order_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@Component
public class OrderException extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value=OrderNotFoundException.class)
	public ResponseEntity handleOrderAlreadyExistException(OrderNotFoundException order)
	
	{
		return  new ResponseEntity("order id Not found in dataBase",HttpStatus.CONFLICT);
		
	}

}
