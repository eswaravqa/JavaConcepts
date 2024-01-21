package OOP_Polymorphism;

public class TestBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tata t1 = new Tata();
		// Call to Science -- Inheritence
		t1.branchDealsWithPhysics();
		
		//Call to method in Tata class -- Same class method calling 
		t1.autoPilot();
		
	    //call to Tata - Method Override
		t1.start();

		//Top casting 
		Bus t2 = new Tata();
		t2.start();
		t2.numberOfPassengers();

	}

}
