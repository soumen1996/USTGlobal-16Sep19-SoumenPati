package com.ustglobal.sorting;

import java.util.Comparator;

public class SortByColors implements Comparator<Pen>{
	
	@Override
	public int compare(Pen p1, Pen p2) {
	
		String s = p1.color;
		String t = p2.color;
		
		
		return s.compareTo(t);
	}


}
