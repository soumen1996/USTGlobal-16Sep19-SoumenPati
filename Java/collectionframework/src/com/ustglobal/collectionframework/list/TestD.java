package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(45.6);
		al.add(45.6);
		al.add("Yash");
		al.add(true);
		
		ListIterator li = al.listIterator();
		
		while(li.hasNext()) {
			Object ob = li.next();
			System.out.println(ob);
		}
		
		System.out.println("------------------");
		
		while(li .hasPrevious()) {
			Object o = li.previous();
			System.out.println(o);
		}
	}

}
