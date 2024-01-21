package coreJava;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaAssignment {

	public static void main(String[] args) {
		
	
		System.out.println("**First Program Output**");
		//** #1:Find the highest value elemnet in an array
		int ar1[] = {25, 87, 91, 42, 99, 21};  //array declared with array literals 
		int highestValueNumber = 0;
		
		for (int i=0; i<ar1.length-1; i++) {
			if (ar1[i]<ar1[i+1])
					{highestValueNumber = ar1[i+1];}			
			
		}
		System.out.println("HighestValueNumber: "+highestValueNumber);
		
		System.out.println("");
		System.out.println("**Second Program Output**");
		//** #2: Switch case to print test execution environment 
		String environment = "DEV";
		
		switch (environment.toLowerCase().trim()) {
		case "qa":
			System.out.println("Test execution started in: "+ environment + " environment");
			break;
		case "dev":
			System.out.println("Test execution started in: "+ environment + " environment");
			break;
		case "stage":
			System.out.println("Test execution started in: "+ environment + " environment");
			break;
		case "prod":
			System.out.println("Test execution started in: "+ environment + " environment");
			break;

		default:
			System.out.println("Please input correct environment...");
			break;
		}
		
		System.out.println("");
		System.out.println("**Third Program Output**");
		//** #3: Write a program to delete a specific number from an array. Print array after deletion
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(22, 33, 55, 66, 77)) ;
		System.out.println("Array Before Deletion: "+ ar2);
	
		int numberToDelete = 55;
		for (int i = 0; i<ar2.size()-1; i++) {
			if (ar2.get(i) == numberToDelete) {
				ar2.remove(i);		
				break;
			}
		}
		
		System.out.println("Array After Deletion: "+ ar2);
		
		
		
	}

}
