package BuilderPattern;

public class CabBookingApp {

	public static void main(String[] args) {
		
		OlaApp b1 = new OlaApp();
	//	b1.login("guru@gmail.com", "guru123");
		//b1.search("100 Dufay", "Bramelea City Center");
		//b1.payment("1234 5478 6589 5236", 171);
		//b1.driverDetails("Rehman Khadir", 4524);
		
		b1.login("abhi@gmail.com", "abhi123")
		.search("180 Veterns", "Brampton City Center")
		.payment("1234 5478 6589 5236", 171)
		.driverDetails("Abdul Sattar", 4524);
		
		
		
				
				

	}

}
