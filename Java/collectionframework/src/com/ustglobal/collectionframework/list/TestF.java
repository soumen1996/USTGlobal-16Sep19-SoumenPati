package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Anupama");
		al.add("Savitha");
		
		String name =  al.get(0);
		System.out.println(name.toUpperCase());
		
		Iterator<String> li = al.iterator();
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		System.out.println("================");
		
		ListIterator<String> ll = al.listIterator();
		while(ll.hasNext()) {
			String s = ll.next();
			System.out.println(s);
			
		System.out.println("================");
		
		for(String n : al) {
			System.out.println(n);
		}
		}
	}

}
