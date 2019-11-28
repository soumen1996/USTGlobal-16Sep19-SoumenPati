package com.ustglobal.thread.defining;

public class TestThread {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		MyThread m = new  MyThread();
		
		/*Don't Call run() method,it behaves like normal program
		all code will be executed inside main thread only.
		m.run();*/
		
		m.start();
		/*m.start();IllegalThreadStateException*/ 
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
	}

}
