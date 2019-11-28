package com.ustglobal.lambdaexpressions;

public class TestFactorial {
	
	public static void main(String[] args) {
		
		FactorialInterface f = (a)-> {
			int fact = 1;
			for(int i = 1;i<=a;i++) {
				fact = fact*i;
			}
			
			return fact;
		};
		
		int factorial = f.gectFact(5);
		System.out.println(factorial);
	}

}
