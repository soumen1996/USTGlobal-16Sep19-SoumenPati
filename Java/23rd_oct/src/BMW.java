
public class BMW implements Automobile,AutoMobileWithAbs{

	@Override
	public int gear() {
		
		System.out.println("gear() method");
		return 10;
	}

	@Override
	public void gps() {
		
		System.out.println("gps() return");
		
	}
	
	public void abs() {
		
		System.out.println("ABS Implemented.");
	}
	
	
	

}
