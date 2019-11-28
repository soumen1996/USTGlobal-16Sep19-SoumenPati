
public class Student {
	
	String name;
	int rollno;
	final String cname = "QSpiders";
	final int cid;
	
	public Student() {
		this.cid = 200; 
		this.name = "Baishakhi";
	}
	public Student(String name, int rollno, int cid) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	
	final void printDetails() {
		System.out.println("Hi "+ name + " Welcome to "+ cname);
	}
	
	final void printDetails(String name) {
		System.out.println("Hi "+ name + " Welcome to "+ cname);
	}
	

}
