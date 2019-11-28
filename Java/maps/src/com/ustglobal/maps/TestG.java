package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(1, "Pawan", 30000);
		Emp e2 = new Emp(2, "Priyanka", 31000);
		Emp e3 = new Emp(3, "ReshuRani", 15000);
		Emp e4 = new Emp(4, "Anushka", 47000);
		Emp e5 = new Emp(5, "Swathi", 37000);
		Emp e6 = new Emp(6, "Priya", 79000);
		Emp e7 = new Emp(7, "Soumen", 27000);
		Emp e8 = new Emp(8, "Swatima", 55000);
		Emp e9 = new Emp(9, "Sumer", 33000);
		
		ArrayList<Emp> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Emp> all = new ArrayList<>();
		all.add(e4);
		all.add(e5);
		all.add(e6);
		
		ArrayList<Emp> all1 = new ArrayList<Emp>();
		all1.add(e7);
		all1.add(e8);
		all1.add(e9);
		
		HashMap<String, ArrayList<Emp>> hm = new HashMap<>();
		
		hm.put("first", al);
		hm.put("second", all);
		hm.put("third", all1);
		
		ArrayList<Emp> first = hm.get("first");
		Iterator<Emp> it = first.iterator();
		while(it.hasNext()) {
			Emp s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("========================");
		}
		
	}

}
