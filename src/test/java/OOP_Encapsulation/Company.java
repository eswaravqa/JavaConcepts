package OOP_Encapsulation;

public class Company {
	
	public String name;
	private int sharePrice;
	public String hq;
	
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice; 		
	}
	
	public int getSharePrice() {
		return sharePrice;		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company obj = new Company();
		obj.name = "Microsoft";
		obj.sharePrice = 100;		
		
		
	}

}
