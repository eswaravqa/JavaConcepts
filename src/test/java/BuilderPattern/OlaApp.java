package BuilderPattern;

public class OlaApp {
	
	public OlaApp login() {
		System.out.println("default login or user already logged in");
		return this;
	}
	public OlaApp login(String un, String pw) {
		System.out.println("Login with UN: "+ un + ": "+pw);
		return this;
	}
	public OlaApp search(String destination) {
		System.out.println("Search cabs from current location to:"+ destination);
		return this;
	}
	public OlaApp search(String source, String destination) {
		System.out.println("Search cabs from:" + source + "To: "+ destination);
		return this;
	}
	public OlaApp payment(String cc, int cvv) {
		System.out.println("Payment details:"+ cc + ": "+ cvv);
		return this;
	}
	public OlaApp driverDetails(String name, int carNumber) {
		System.out.println("Driver and car details. Name:"+ name + "Car Number: "+ carNumber);
		return this;
	}

}
