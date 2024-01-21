package JavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First N digits in Fibonacci series
		
		int n1=0;	
		int n2=1;
		int Sum=0;
		int c=8; //How many number in the sereis we want to print
		
		for (int x=2; x<c; x++ ) {
			Sum = n1+n2;
			System.out.println(Sum);
			n1=n2;
			n2=Sum;
					
		}

	}

}
