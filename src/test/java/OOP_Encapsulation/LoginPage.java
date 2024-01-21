package OOP_Encapsulation;

public class LoginPage {
	
	private  String userName;
	private  String passWord;
	
	//setter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	//getter
	public String getUserName() {
		return userName;
		
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public void login(String userName, String passWord) {
		System.out.println("Login with UserName:" +""+userName+ "  "+"PassWord:"+"  "+passWord);
	}
	

}
