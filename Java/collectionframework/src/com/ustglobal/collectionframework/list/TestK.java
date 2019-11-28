package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {
	
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.5);
		al.add(87.6);
		al.add(34.5);
		al.add(12.3);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		al.add(2, 54.6);
		System.out.println("After Add In Second Index: "+al);
		al.remove(0);
		System.out.println("After Removing 0th Index: "+al);
		
		al.remove(null);
		System.out.println("After Removing The null: "+al);
		
		Double val = al.get(4);
		System.out.println("Object at 4th Index: "+val);
		
		al.set(2, 77.6);
		System.out.println("After Replacing 2nd Index: "+al);
		
		al.clear();
		System.out.println("After Clear Method: "+al);
		
		al.contains(54.6);
		
		List<Double> all = new ArrayList();
		all.add(12.3);
		all.add(23.4);
		all.add(34.5);
		
		al.addAll(all);
		System.out.println("After Add All: "+al);
		
		boolean contain = al.containsAll(all);
		System.out.println("Contains all of all "+contain);
		
		boolean res = al.removeAll(all);
		System.out.println("Remove all of all "+res);
	}

}
