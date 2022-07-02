package com.order_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

public class OrderNotFoundException extends RuntimeException{
	
	private static final long serialVersionUid=1L;
	String msg;
	public OrderNotFoundException(String msg, HttpStatus notFound) {
		super(msg);
		this.msg=msg;	
		
	}

}
