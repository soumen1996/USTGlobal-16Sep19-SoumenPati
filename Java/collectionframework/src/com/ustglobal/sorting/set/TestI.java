package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	
	
	public static void main(String[] args) {
		
		SortByName sb = new SortByName();
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);
		Bank b1 = new Bank("HDFC", 560068, 6768689);
		Bank b2 = new Bank("SBI", 560071, 98988989);
		Bank b3 = new Bank("CITI", 560054, 8898988);
		Bank b4 = new Bank("Axis", 560076, 123456);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		
		System.out.println("**********Using Iterator*******");
		
		Iterator<Bank> it = ts.iterator();
		
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is "+b.name);
			System.out.println("Pincode is "+b.pincode);
			System.out.println("MICR is "+b.micr);
			
			System.out.println("==================");
		}
		
		
		System.out.println("**********Short by pin*******");
		
		
		SortByPin sp = new SortByPin();
		TreeSet<Bank> tb = new TreeSet<Bank>(sp);
		Bank b5 = new Bank("HDFC", 560068, 6768689);
		Bank b6 = new Bank("SBI", 560071, 98988989);
		Bank b7 = new Bank("CITI", 560054, 8898988);
		Bank b8 = new Bank("Axis", 560076, 123456);
		Bank b9 = new Bank("Axis", 560076, 123456);
		
		tb.add(b5);
		tb.add(b6);
		tb.add(b7);
		tb.add(b8);
		tb.add(b9);
		
		System.out.println("**********Using Iterator*******");
		
		Iterator<Bank> itr = tb.iterator();
		
		while(itr.hasNext()) {
			Bank bb = itr.next();
			System.out.println("Name is "+bb.name);
			System.out.println("Pincode is "+bb.pincode);
			System.out.println("MICR is "+bb.micr);
			
			System.out.println("==================");
		}
		
		
	}

}
