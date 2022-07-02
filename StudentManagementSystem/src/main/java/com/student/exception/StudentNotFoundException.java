package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseStatus;

//@Component
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends RuntimeException {
	
	//String massage;

private static final long SerialVersionUId=1L;
	
	private String ResourseName;
	private String fieldName;
	private Object fieldValue;
	
	public StudentNotFoundException(String ResourseName,String fieldName,String fieldValue)
	{
		super(String.format("%s Not Found with %s:'%s'", ResourseName, fieldName,fieldValue));
		this.ResourseName=ResourseName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue;
				
	}
	

	public StudentNotFoundException(String resourseName, String fieldName, Object fieldValue) {
		super();
		ResourseName = resourseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}


	public String getResourseName() {
		return ResourseName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public Object getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}
