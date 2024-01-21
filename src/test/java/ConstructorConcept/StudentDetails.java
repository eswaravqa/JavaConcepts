package ConstructorConcept;

public class StudentDetails {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Rama";
		s1.uid = 200685;
		s1.cls = 8;
		s1.gender = 'b';
		s1.isPresent = true;
		
		System.out.println(s1.name+" | "+s1.uid+" | "+s1.cls+" | "+s1.gender+" | "+s1.isPresent);
		System.out.println("---------------------------------");
		
		Student s2 = new Student("Krishna", 8, 200686, 'b', false);
		System.out.println(s2.name+" | "+s2.uid+" | "+s2.cls+" | "+s2.gender+" | "+s2.isPresent);
		
				

	}

}
