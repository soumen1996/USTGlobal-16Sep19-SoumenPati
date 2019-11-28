package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName2 implements Comparator<Customer>{
	
	
		
		@Override
		public int compare(Customer c1, Customer c2) {
			return c1.name.compareTo(c2.name);
		}
		
		



}
