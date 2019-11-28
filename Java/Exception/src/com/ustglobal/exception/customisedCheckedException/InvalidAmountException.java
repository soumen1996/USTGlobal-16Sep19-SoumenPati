package com.ustglobal.exception.customisedCheckedException;

public class InvalidAmountException extends Exception {
	
	private String message = "Daily Limit is 40000";
	
	public String getMessage() {
		return message;
	}
}
