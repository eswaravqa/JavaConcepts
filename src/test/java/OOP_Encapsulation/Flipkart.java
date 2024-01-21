package OOP_Encapsulation;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoginPage lp =new LoginPage();
		lp.setUserName("eswar12");
		lp.setPassWord("balaji@7H");
		
		lp.login(lp.getUserName(), lp.getPassWord());
		
		lp.login(null, null);
		
		
	}

}
