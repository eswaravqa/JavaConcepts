package HashMap;

import java.util.HashMap;

public class UserCredenMap {
	
	public static String getUserCred(String role) {
		HashMap<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin@infy.com:admin@12");
		credMap.put("customer", "customer@gmail.com:cust@12");
		
		return credMap.get(role);
	}
	
	public static void doLogin(String un, String pw) {
		System.out.println("Login with User Name: "+ un + " | | Password : "+ pw );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cred[] = getUserCred("admin").split(":");
		String un = cred[0].trim();
		String pw = cred[1].trim();
		doLogin(un,pw);
		

	}

}
