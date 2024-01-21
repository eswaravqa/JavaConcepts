package coreJava;

public class Employee {
	
	String name;
	int age;
	boolean isPerm;
	int empNum;
	double sal;

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.age=25;
		e1.name="Kavya";
		e1.empNum=320001;
		e1.isPerm=true;
		e1.sal=25000.24;
		
		System.out.println(e1.age+" "+e1.empNum+" "+e1.name+" "+e1.sal+" "+e1.isPerm);
		
		
		

	}

}
