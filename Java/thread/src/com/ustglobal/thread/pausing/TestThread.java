package com.ustglobal.thread.pausing;

public class TestThread {
	
	public static void main(String[] args) {
		System.out.println("Main Strated");
		
		MyThread t = new MyThread();
		t.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Main Started");
		}
		
		System.out.println("Main Ended");
	}

}
