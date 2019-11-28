package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
		
		public static void main(String[] args) {
			
			LinkedList li = new LinkedList();

			li.add(12);
			li.add(34.5);
			li.add("more");
			li.add(true);
			li.add(null);
			
			System.out.println("=======Using For Loop======");
			
			for( int i = 0; i<li.size();i++) {
				System.out.println(li.get(i));
			}
			
			
			System.out.println("=======Using Iterator======");
			
			Iterator it = li.iterator();
			while(it.hasNext()) {
				Object o = it.next();
				System.out.println(o);
			}
			
			
			System.out.println("=======Using List Iterator======");
			
			ListIterator itr = li.listIterator();
			while(itr.hasNext()){
				Object obj = itr.next();
				System.out.println(obj);
			}
			
			System.out.println("=======Using List Iterator Backward======");
			
			while(itr.hasPrevious()){
				Object obj = itr.previous();
				System.out.println(obj);
			}
		}
}
