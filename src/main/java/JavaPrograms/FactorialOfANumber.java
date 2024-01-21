package JavaPrograms;

public class FactorialOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=6;
		int factorial=1;
		for (int k=x; k!=0 ; k--) {
			factorial = factorial*k;
		}
		
		System.out.println("Factorial of "+ x + " is: "+ factorial);
		

	}

}
