package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet();
		ts.add("Roopa");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("Munni");
		ts.add("Sheela");
		
		

		System.out.println("*********Using For Each*********");
		for (String st : ts) {
			
			System.out.println(st);
			
		}
		
		
		System.out.println("******Using Iterator**********");
		Iterator<String> st = ts.iterator();
		while(st.hasNext()) {
			String p = st.next();
			System.out.println(p);
	}
	
	
	
	}
}
