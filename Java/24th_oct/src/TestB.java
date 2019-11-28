
public class TestB {
	
	static int b;
	 int a;
	 
	 {
		 a = 10;
		 b = 20;
		 System.out.println("Non Static Block");
	 }
	 
	 public static void main(String[] args) {
		System.out.println("Main Started");
		TestB b1 = new TestB();
		TestB b2 = new TestB();
		
		System.out.println("Main Ended");
	} 
	 
	 

}
