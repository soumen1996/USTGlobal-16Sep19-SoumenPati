package com.ustglobal.exception.customisedCheckedException;

public class TestAmount {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(20000);
			System.out.println("WithDraw Your Cash");
		} catch (InvalidAmountException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		
	}
	
	

}
