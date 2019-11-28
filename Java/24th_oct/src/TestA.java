
public class TestA {
	
	static int a;
	int b;
	
	static {
		a = 10;
		System.out.println("Static Block 1");
	}
	
	public TestA() {
		System.out.println("TestA() Constructor");
	}
	
	public static void main(String[] args) {
		TestA t1 = new TestA();
		TestA t2 = new TestA();
		System.out.println("a value "+a);
		
	}
	
	static {
		a = 20;
		System.out.println("Static Block 2");
	}
	
	
	static {
		a = 40;
		System.out.println("Static Block 3");
	}
}
