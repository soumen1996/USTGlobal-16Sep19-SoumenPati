package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Ajay");
		ht.put(102, "Vijay");
		ht.put(100, "Sonu");
		ht.put(99, "Monu");
		ht.put(104, "Srirram");

		
		System.out.println("Data "+ht);
	}

}
