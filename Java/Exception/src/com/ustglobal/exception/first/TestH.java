package com.ustglobal.exception.first;

public class TestH {
	
	public static void main(String[] args) {
		
		
		System.out.println("Main Started");
		PayTm p = new PayTm();
		
		try {
			p.book();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Exception Caught In Main");
		}finally {
			System.out.println("Executing Finally");
		}
		
		System.out.println("Main Ended");
	}

}
