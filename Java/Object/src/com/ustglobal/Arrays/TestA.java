package com.ustglobal.Arrays;

public class TestA {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 10;
		nums[2] = 10;
		nums[3] = 10;
		nums[4] = 10;
		
		for(int i = 0;i<=nums.length;i++) {
			System.out.println(nums[i]);
		}
	
	System.out.println("==================");
	for(int num : nums) {
		System.out.println(num);
	}
	
	System.out.println("==================");
	char[] ch = {'a','b','c','d'};
	for(int i = 0;i<ch.length;i++) {
		System.out.println("==================");
		
		for(int c : ch) {
			System.out.println(c);
		}
		
		System.out.println("===========");
		boolean[] b = {true,false,true,false,true};
		
		byte[] bb = {15,25,18,19,17,95};
		
		for(int j = 0;i<bb.length;j++) {
			
			System.out.println(bb[j]);
			
		}
		System.out.println("==================");
			
			for(byte bc : bb) {
				System.out.println(bc);
			}
			
		
		double[] dd = {105.56,98.65,75.98,364.15,89.54};
		
	for(int j = 0;i<dd.length;j++) {
			
			System.out.println(dd[j]);
			
		}
		System.out.println("==================");
			
			for(double d : dd) {
				System.out.println(d);
			}
			
			
	String[] names = {"aishu","kavya","divya","Priya"};
	
	for(int j = 0;i<names.length;j++) {
		
		System.out.println(names[j]);
		
	}
	System.out.println("==================");
		
		for(String name : names) {
			System.out.println(name);
		}
	
		
	}
	}
	

}
