
public class Student {
	
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
//	void printDetails() {
//		System.out.println("Name: "+name+" Id: "+id+" Percentage: "+percentage);
//	}
//	
	
	
	
	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
