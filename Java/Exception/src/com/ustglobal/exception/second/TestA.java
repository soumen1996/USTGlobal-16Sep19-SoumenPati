package com.ustglobal.exception.second;

public class TestA {
	
	public static void main(String[] args) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
}
