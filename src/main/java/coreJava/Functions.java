package coreJava;

public class Functions {
	
	public int getCarPrice(String carName) {
		System.out.println("Get car price of "+ carName);
		if (carName.equals("Q5")) {
			return 70000;
		}
		else if(carName.equals("GLC300")) {
			return 80000;
		}
		else if(carName.equals("X3")){
			return 90000;
		}
		else {
			System.out.println("Please input correct car name....");
			System.out.println("Car not found....");
			return -1;
		}
	}
	
	public int addition(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functions f1 = new Functions();
		//f1.getCarPrice("Q5");
		String carName="Cayan";
		int a = f1.getCarPrice(carName);
	
		System.out.println(carName + " Car Price is: "+ a );
		
		Functions f2 = new Functions();
			int c=	f2.addition(10, 20);
			System.out.println("Sum of two values is: "+c);
		
		
		

	}

}
