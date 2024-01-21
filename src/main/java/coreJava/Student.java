package coreJava;

public class Student {
	
	public String stdName;
	public int stdAge;
	public int stdClass;
	public char stdSection;
	public String stdAddress;
	public boolean stdActive;
	public float stdCGP;
	
	//This is also called constructor overloading
	//Constructor with two parameters Student Name and Age
	Student(String stdName, int stdAge){
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	
	//Constructor with three Parameters Name, Class & Section
	Student(String stdName, int stdClass, char stdSection){
		this.stdName = stdName;
		this.stdClass = stdClass;
		this.stdSection = stdSection;
	}
	
	//Similarly we can write n number of constructor with different parameters defined at class level 
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Mosen", 12);
		System.out.println("Student Name: "+s1.stdName+ " | "+"Student Age: "+s1.stdAge);
		
		Student s2 = new Student("Jareen",5,'B');
		System.out.println("Student Name: "+s2.stdName+ " | "+"Student Class: "+s2.stdClass+ " | "+"Student Section: "+s2.stdSection);
		

	}

}
