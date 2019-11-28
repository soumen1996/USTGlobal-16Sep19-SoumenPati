package com.ustglobal.sorting;

import java.util.Collections;
import java.util.LinkedList;

public class Test {
	
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(12);
		l.add(13);
		l.add(34);
		l.add(3);
		l.add(10);
		
		System.out.println("Before Sorting "+l);
		Collections.sort(l);
		
		System.out.println("After Sorting "+l);
		
		Collections.reverse(l);
		System.out.println("After Reverse ");
		
		Collections.shuffle(l);
		System.out.println("After Shuffle "+l);
	}

}
