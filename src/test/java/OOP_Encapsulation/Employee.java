package OOP_Encapsulation;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1 = new Company();
		c1.name = "hp";
		c1.hq = "Pune";
		
		c1.setSharePrice(200);
		
		int p1 = c1.getSharePrice();
		System.out.println(p1);

	}

}
