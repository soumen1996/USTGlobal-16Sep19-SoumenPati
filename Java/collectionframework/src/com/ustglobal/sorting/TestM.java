package com.ustglobal.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Girija");
		al.add("Vanaja");
		al.add("Jalaja");
		al.add("Kiran");
		
		System.out.println("Before Sort ---> "+al);
		Collections.sort(al);
		
		System.out.println("After Sort----> "+al);
	}
}
