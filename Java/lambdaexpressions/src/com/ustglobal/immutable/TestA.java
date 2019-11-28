package com.ustglobal.immutable;

public class TestA {
	
	public static void main(String[] args) {
		MyString ms = new MyString(03, "Soumen");

		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);
		
		MyString ms1 = ms.changeContent(20, "Rupa");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		
		System.out.println("===============");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollno());
		
	
	}
		

}
