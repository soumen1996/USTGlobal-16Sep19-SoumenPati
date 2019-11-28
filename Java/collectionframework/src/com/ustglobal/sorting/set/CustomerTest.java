package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer c1 = new Customer("Pawan", 01, 45000);
		Customer c2 = new Customer("Priyanka", 02, 47000);
		Customer c3 = new Customer("Reshu", 03, 55000);
		Customer c4 = new Customer("Soumen", 04, 95000);
		Customer c5 = new Customer("Anushka", 05, 105000);
		
		SortByName2 sn = new SortByName2();
		TreeSet<Customer> ts = new TreeSet<Customer>(sn);
	
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		System.out.println("****Using Iterator*******");
		
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Id is "+c.id);
			System.out.println("Name is "+c.name);
			System.out.println("Salary is "+c.salary);
			System.out.println("=====================");
		}
	}
}
