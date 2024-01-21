package JavaPrograms;

import java.util.Scanner;

public class NumberOfTimeADigitAppearsInANumber {

	public static  int numberOfTimes(int n, int d) {
		
		int count=0;
		while(n!=0) {
			int digit = n%10;
			if(digit==d) count++;
			n=n/10;
		}
		return count;		
		
	}	
	
	public static void main(String[] args) {
	
		try (Scanner scn = new Scanner(System.in)) {
			int a=scn.nextInt();
			int b=scn.nextInt();
			int cnt = 0;
			try {
				cnt = numberOfTimes(a, b);
			} catch (Exception e) {
			e.printStackTrace();
			}
			System.out.println("Digit: "+ b + " in number: "+ a + " appears "+ cnt + " times");		
		
	}
	}
}


