package coreJava;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10, b=20;
		
		System.out.println("Before Swapping");
		System.out.println("a: "+a+" b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping");
		System.out.println("a: "+a+" b: "+b);
		

	}

}
