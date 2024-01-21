package ConstructorConcept;

public class UserRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(String firstName, String lastName, String email, String mobileNumber, String userId,String password)
		
		RegistrationPage u1 = new RegistrationPage("Tom","Hanks","tom.hanks@gmail.com","+1 (647)-671-0044", "tom.hanks", "Password12");
		System.out.println(u1.getFirstName()+"|"+u1.getLastName()+"|"+u1.getEmail()+"|"+ u1.getMobileNumber()+"|"+ u1.getUserId()+"|"+u1.getPassword());
		
		System.out.println("----------");
		
		u1.setEmail("tom.hanks1995@gmail.com");
		
		System.out.println(u1.getFirstName()+"|"+u1.getLastName()+"|"+u1.getEmail()+"|"+ u1.getMobileNumber()+"|"+ u1.getUserId()+"|"+u1.getPassword());
		
		
		
		

	}

}
