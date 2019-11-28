package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(21);
		ts.add(9);
		ts.add(39);
		

		System.out.println("*********Using For Each*********");
		for(Object o : ts) {
			System.out.println(o);
		}
		
		System.out.println("******Using Iterator**********");
		Iterator<Object> ob = ts.iterator();
		while(ob.hasNext()) {
			Object p = ob.next();
			System.out.println(p);
		
	}
		
	}

}
