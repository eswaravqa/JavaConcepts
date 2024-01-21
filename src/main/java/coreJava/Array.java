package coreJava;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a fixed length array and print elements 
		int[] firstArray = {1,2,3,4,5};
		for(int i=0; i<firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
		
		//Total array 
		double[] totArray = {3.3, 5.5, 8.8, 4.4};
		double total = totArray[0];
		for(int i=1; i<totArray.length; i++) {
			total=total+totArray[i];			
		}
		System.out.println("Total of array elements is:" + total);
		
		//max element in array 
		double[] secondArray = {9.9, 3.3, 4.8, 22.2, 7.7, 10.4, 1.1};
		double maxElement = secondArray[0];
		for(int i=1; i<secondArray.length; i++) {
			if (secondArray[i]>maxElement) {
				maxElement = secondArray[i];
			}
		}
		System.out.println("MaxElement in the array is: "+maxElement);

	}
}
