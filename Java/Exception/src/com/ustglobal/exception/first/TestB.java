package com.ustglobal.exception.first;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int a = 10;
		int b = 0;
		try {
			b = 10/2;
			System.out.println(b);
			System.out.println("hello");
			System.out.println("happy diwali");
		}
		
		catch(ArithmeticException ae) {
			System.out.println("Number is devided by zero");
		}
		
		System.out.println(b);
		System.out.println("main ended");
		
		
	
	}
}
