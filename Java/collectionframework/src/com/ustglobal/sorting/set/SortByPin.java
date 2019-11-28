package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank> {
	@Override
	public int compare(Bank o1, Bank o2) {
		// TODO Auto-generated method stub
		Integer i = o1.pincode;
		Integer j = o2.pincode;
		return i.compareTo(j);
	}

}
