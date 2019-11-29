package com.ustglobal.thread.pausing;

public class TestJoin {
	
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		MyJoinThread t = new MyJoinThread();
		t.start();  
		try {
			t.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//return type is void & throws interrupted exception
		
		for(int i = 0;i<10;i++) {
			System.out.println("Main Thread");
		}
		
		System.out.println("Main Ended");
	}

}
