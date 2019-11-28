package com.ustglobal.thread.porperties;

public class MyIdThread extends Thread {
	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		
	System.out.println("my id thread "+mi.getId());
		
	
	System.out.println("Priority "+Thread.currentThread().getPriority());

	/*Thread.currentThread().setPriority(16); IllegalArgumentException becuase sholud be set in between 0 to 10*/
	System.out.println("Main Ended");
	}

}
