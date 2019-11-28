package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	
	public static void main(String[] args) {
		Student s1 = new Student(2, "Divya", 67.89);
		Student s2 = new Student(5, "ambika", 56.67);
		Student s3 = new Student(12, "Kiran", 45.7);
		Student s4 = new Student(34, "Dinesh", 78.9);
		Student s5 = new Student(1, "Chinnu", 35.67);
		Student s6 = new Student(5, "Girl", 67.8);
		Student s7 = new Student(5, "Sonu", 45.78);
		Student s8 = new Student(5, "Dimple", 33.2);
		Student s9 = new Student(5, "Sweety", 89.67);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> all = new ArrayList<>();
		all.add(s4);
		all.add(s5);
		all.add(s6);
		
		ArrayList<Student> all1 = new ArrayList<Student>();
		all1.add(s7);
		all1.add(s8);
		all1.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		
		hm.put("first", al);
		hm.put("Second", all);
		hm.put("Third", all1);
		
		ArrayList<Student> first = hm.get("Second");
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("========================");
		}
		
		
	}

}
