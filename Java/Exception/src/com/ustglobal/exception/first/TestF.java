package com.ustglobal.exception.first;

public class TestF {
	
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
		
		catch (NullPointerException e) {
			System.out.println("Dontg Play With Null");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index Not Present");
		}
		
		catch (ArithmeticException ae) {
			System.out.println("Divided by zero erro");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("Main Ended");
		
	}

}
