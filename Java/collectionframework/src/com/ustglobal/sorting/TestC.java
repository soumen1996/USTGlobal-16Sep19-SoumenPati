package com.ustglobal.sorting;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> l  = new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element "+peekElement);
		
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element "+peekFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Element "+peekLastElement);
		
		System.out.println("After Peek------> "+l);
		
		System.out.println("=======================");
		
		Integer pollElement = l.poll();
		System.out.println("poll Element "+pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll First Element "+pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("poll Element "+pollLastElement);
		
		System.out.println("After poll------> "+l);
		

		l.push(12);
		System.out.println("After Push--------> "+ l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After Pop---------> "+l);
		
		
	}
}
