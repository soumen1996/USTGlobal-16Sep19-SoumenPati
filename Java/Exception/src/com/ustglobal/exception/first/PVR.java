package com.ustglobal.exception.first;

public class PVR {
	
	void book()
	{
		System.out.println("Booking Start");
		try {
			
			System.out.println(10/0);
			System.out.println("Logic For Booking");
			System.out.println("Booking Confirmed");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Booking Failed");
			throw e;
		}
	}

}
