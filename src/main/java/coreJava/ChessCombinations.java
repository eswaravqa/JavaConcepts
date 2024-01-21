package coreJava;

public class ChessCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inputNumber = 12;
		double  x=2;
		
		for (int i=2; i<inputNumber; i++) {
			
			x=x*x;
			System.out.println("Combination: "+i +" is: "+x);
		}System.out.println();

	}

}
