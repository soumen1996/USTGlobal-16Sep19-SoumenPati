package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(98.7);
		al.add(true);
		al.add("Good Eveneing");
		
		for(int i = 0; i<al.size();i++) {
			 
			System.out.println(al.get(i));
		}
		
		
		Iterator itr = al.iterator();
//		Object o1 = itr.next();
//		System.out.println("Object: "+o1);
//		
//		System.out.println(itr.hasNext());
//		
//		
//		Object o2 = itr.next();
//		System.out.println("Object: "+o2);
//		
//		System.out.println(itr.hasNext());
//
//		Object o3 = itr.next();
//		System.out.println("Object: "+o3);
//		
//		System.out.println(itr.hasNext());
//		
//		Object o4 = itr.next();
//		System.out.println("Object: "+o4);
//		
		
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
	
		
		
		
	}

}
