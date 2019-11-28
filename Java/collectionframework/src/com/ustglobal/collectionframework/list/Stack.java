package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;

public class Stack {
	
	public static void main(String[] args) {
		
		java.util.Stack v = new java.util.Stack();
		
		
		v.add(12);
		v.add(34.5);
		v.add("more");
		v.add(true);
		v.add(null);
		
		
		System.out.println("=======Using For Loop======");
		
		for( int i = 0; i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		
		System.out.println("=======Using Iterator======");
		
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		
		System.out.println("=======Using List Iterator======");
		
		ListIterator itr = v.listIterator();
		while(itr.hasNext()){
			Object obj = itr.next();
			System.out.println(obj);
		}
		
		System.out.println("=======Using List Iterator Backward======");
		
		while(itr.hasPrevious()){
			Object obj = itr.previous();
			System.out.println(obj);
		}

		

	}

}
