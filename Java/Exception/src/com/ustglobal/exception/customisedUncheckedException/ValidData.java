package com.ustglobal.exception.customisedUncheckedException;

public class ValidData {
	
	void varify(int age) {
		if(age < 18) {
			throw new InvalidAgeException("Better Luck Next Time!!");
		}
	}

}
