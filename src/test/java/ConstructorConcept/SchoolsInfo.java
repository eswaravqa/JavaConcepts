package ConstructorConcept;

public class SchoolsInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		School s1 = new School();
		
		s1.name = "The Delhi Public School";
		s1.isRegistered = 'Y';
		s1.address = "D.No:123/45, Periyar Street, Vadapalani, Chennai, TN";
		s1.startYear = 1989;
		s1.fundAmount = 200000.02;
		
		System.out.println(s1.name+"|"+s1.address+"|"+s1.fundAmount+"|"+s1.isRegistered+"|"+s1.startYear);
		
		System.out.println("-------------------");
		
		School s2 = new School("The Oxford Public School", "Line#7, Matrusri Nagar, Madhuravada, East Godavari, AndhraPradesh");
		
		System.out.println(s2.name+"|"+s2.address);
		
		System.out.println("-------------------");
		
		School s3 = new School("PSBB", 1982, 'Y');
		
		System.out.println(s3.name+"|"+ s3.startYear + "|" + s3.isRegistered);
		
		
		
		
	
		
	
		
		
	}

}
