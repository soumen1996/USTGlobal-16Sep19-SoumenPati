
public class TestE {
	
	public static void main(String[] args) {
		
		Car c1 = new Car(35000000, "Audi A3", "Black");
		Car c2 = new Car(35000000, "Audi A3", "Black");
		Car c3 = new Car(35000000, "Audi A3", "Black");
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
	}
}
