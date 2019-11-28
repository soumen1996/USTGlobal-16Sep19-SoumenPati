package com.ustglobal.exception.first;

public class TestG {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int[] a = {10,20,30};
		int b = 10;
		String s = "hello";
		
		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[2]);
			System.out.println(b/0);
		}
	
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Occured");
		}
		
		System.out.println("Main Ended");
		
	}

}
