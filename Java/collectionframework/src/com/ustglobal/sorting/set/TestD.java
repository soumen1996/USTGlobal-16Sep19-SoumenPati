package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet();
		ls.add(12.3);
		ls.add(25.6);
		ls.add(1.5);
		ls.add(67.5);
		ls.add(34.5);
		
		System.out.println("*********Using For Each*********");
		for(Double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("******Using Iterator**********");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double d = it.next();
			System.out.println(d);
		
	}
	}
}
