package com.qsp.studentapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.qsp.studentapp.dto.ResponseStructure;

@ControllerAdvice
public class StudentException {
	@ExceptionHandler(StudentNullValueException.class)
	public ResponseEntity<ResponseStructure<String>> studentNullValue(StudentNullValueException exception){
		ResponseStructure<String> structure=new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.BAD_REQUEST.value());
		structure.setMessage("Bad Request");
		structure.setData(exception.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.BAD_REQUEST);
	}
}
