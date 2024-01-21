package ConstructorConcept;

public class School {
	
	public String name;
	public int startYear;
	public String address;
	public char isRegistered;
	public double fundAmount;
	
	//default constructor 
	public School() {		
	}
	
	public School(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public School(String name, int startYear, char isRegistered) {
		this.name = name;
		this.startYear = startYear;
		this.isRegistered = isRegistered;
	}
	

}
