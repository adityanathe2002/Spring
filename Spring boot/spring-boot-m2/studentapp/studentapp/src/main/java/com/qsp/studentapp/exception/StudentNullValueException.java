package com.qsp.studentapp.exception;

public class StudentNullValueException extends RuntimeException{

	@Override
	public String getMessage() {
		return "don't assign null value for phone or email";
	}
}
