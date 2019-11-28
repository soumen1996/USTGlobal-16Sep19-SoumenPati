package com.ustglobal.Arrays;

public class TestB {
	
	public static void main(String[] args) {
		
		int[] nums = {10,20,15,87,98};
		receive(nums);
	}
	
	static void receive(int[] numbers) {
		
		for(int num : numbers) {
			System.out.println(num);
		}
		
	}
	
	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}
	
	int[] values = getArray();
	
	static void receiveString(String[] names) {
		
		for( String name : names) {
			System.out.println(name);
		}
		
	}
		
		static void getString(String[] names) {
			
			for( String name1 : names) {
				System.out.println(name1);
			}
		
		
	

}
}
