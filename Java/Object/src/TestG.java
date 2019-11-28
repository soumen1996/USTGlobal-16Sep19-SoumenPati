
public class TestG {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(01, "Soumen", 30000);
		Employee e2=new Employee(02, "Reshu", 40000);
		Employee e3=new Employee(03, "Anushka", 30000);
		Employee e4=new Employee(01, "Soumen", 30000);
		
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e4));
		
		
		
	}

}
