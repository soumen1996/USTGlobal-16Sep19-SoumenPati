package com.ustglobal.exception.customisedUncheckedException;

public class InvalidAgeException extends RuntimeException {
	
	String message = "Invalid Age Below 18Years Not Allowed";
	
	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
