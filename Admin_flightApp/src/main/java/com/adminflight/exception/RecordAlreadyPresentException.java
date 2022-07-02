package com.adminflight.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;


public class RecordAlreadyPresentException extends RuntimeException {
	
	
	public RecordAlreadyPresentException(String msg)
	{
		super(msg);
	}
	

}
