package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	
	public static void main(String[] args) {
		
		Voting v = new Voting("012SVJSH", "Soumen Pati", 23);
		
		
		Predicate<Voting> p = (a) ->{
			if(v.age >= 18) {
				return true;
			}
			else {
				return false;
			}
		};
		
		
		boolean result = p.test(v);
		System.out.println(result);
		

		
	}

}
