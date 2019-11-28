package com.ustglobal.sorting;

import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
		
	
	public static void main(String[] args) {
		
		LinkedList<Laptop> l1 = new LinkedList<Laptop>();
		
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(30000, 1, "Acer");
		Laptop lp3 = new Laptop(35000, 6, "Dell");
		Laptop lp4 = new Laptop(100000, 12, "Macbook");
		Laptop lp5 = new Laptop(50000, 8, "Asus");
		
		l1.add(lp1);
		l1.add(lp2);
		l1.add(lp3);
		l1.add(lp4);
		l1.add(lp5);
		
		l1.add(new Laptop(20000,2 , "Lenevo"));
		displayLaptopDetails(l1);
		
		
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> l)
	{
		Iterator<Laptop> itr = l.iterator();
		while(itr.hasNext()) {
			Laptop lp = itr.next();
			System.out.println("Brand is "+lp.name);
			System.out.println("Price is "+lp.price);
			System.out.println("Ram is  "+lp.ram);
		}
	}
	
	
	
}
