package com.ustglobal.exception.customisedUncheckedException;

public class TestAge {
	
public static void main(String[] args) {
	
	System.out.println("Main Started");
	
	ValidData v = new ValidData();
	
	try {
		v.varify(12);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Exception Occured");
		e.printStackTrace();
	}
	
		v.varify(13);
	System.out.println("Main Ended");
}

}
