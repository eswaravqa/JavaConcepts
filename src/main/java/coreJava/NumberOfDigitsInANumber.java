package coreJava;

import java.util.Scanner;

public class NumberOfDigitsInANumber {
	
	public static int countDigits(int n) {
		if(n==0) return 1;
		if (n<0) n=-n;
		
		int numOfDigits=0;
		while(n!=0) {
			n=n/10;
			numOfDigits++;			
		}
		
		System.out.println();
		return numOfDigits;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner scn = new Scanner(System.in)) {
			int n=scn.nextInt();
			System.out.println("Number of digits in: "+n+" are : "+countDigits(n));
		}

	}

}
