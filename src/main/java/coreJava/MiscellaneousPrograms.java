package coreJava;

import java.util.Scanner;

public class MiscellaneousPrograms {
	
	public static void main(String[] args) {
		
		//Fibonacci Series -- Formula Fib(n)=Fib(n-1)+Fib(n-2)
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
			int n=scn.nextInt();
			int a=0;
			int b=1;
			if(n<0) {
				System.out.println("n can not be a negative value");
				return;
			}
			
			if (n==0) 	System.out.println("Fibonacci series"+a);
			else if (n==1) System.out.println("Fibonacci series"+b);
			else {
				int c=0;
				for (int i=2; i<n; i++) {
					c=a+b;
					a=b;
					b=c;
					System.out.println("Fibonacci series: "+c);
				}
				
			} 
			
		//number of digits in a number
			@SuppressWarnings("resource")
			Scanner scn1= new Scanner(System.in);
			int n1=scn1.nextInt();
			
			if(n1==0 && n1==1) System.out.println("Number of digits: "+1);
			
			
			int numOfDigits = 0;
			while (n1!=0) {
				n1=n1/10;
				numOfDigits++;
			}
			System.out.println("Number of digits: "+ numOfDigits);
		
			
		//Swap two numbers without using third variable 
			
		@SuppressWarnings("resource")
		Scanner scn2= new Scanner(System.in);
		int s=scn2.nextInt();
		@SuppressWarnings("resource")
		Scanner scn3= new Scanner(System.in);
		int t=scn3.nextInt();		
			
			System.out.println("Before swapping value of s:"+s+ " value of t:"+t);			
			s = s+t;
			t = s-t;
			s = s-t;			
			System.out.println("After swapping value of s:"+s+ " value of t:"+t);
		
		
			
		
	}

}
