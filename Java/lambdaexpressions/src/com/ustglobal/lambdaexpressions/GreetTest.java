package com.ustglobal.lambdaexpressions;

public class GreetTest {
	
	public static void main(String[] args) {
		
		GreetInterface g = (message)->{
			System.out.println("Hello");
			System.out.println(message);
		};
		
		g.greet("Lambda Expression");
		
		
	}

}
