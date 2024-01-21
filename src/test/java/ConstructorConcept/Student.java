package ConstructorConcept;

public class Student {
	String name;
	int cls;
	double uid;
	char gender;
	boolean isPresent;
	
	public Student() {
		
	}
	
	public Student(String name, int cls) {
		this.name = name;
		this.cls = cls;		
		
	}
	
	public Student(String name, double uid) {
		this.name = name;
		this.uid = uid;
				
	}
	
	public Student(String name, double uid, char gender) {
		this.name = name;
		this.uid = uid;
		this.gender = gender;		
		
	}
	
	public Student(String name, int cls, boolean isPresent) {
		this.name = name;
		this.cls = cls;
		this.isPresent = isPresent;
		
	}
	
	public Student(String name, int cls, double uid, char gender, boolean isPresent) {
		this.name = name;
		this.cls = cls;
		this.uid = uid;
		this.gender = gender;
		this.isPresent = isPresent;
		
	}


	

}
