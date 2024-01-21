package coreJava;

import java.util.*;


public class ALAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("");
		System.out.println("**First Program Output**");
		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Red");
		colors.add("Green");
		colors.add("Yello");

		for (int k = 0; k < colors.size(); k++) {
			System.out.println(colors.get(k));
		}
		System.out.println("-----------");

		System.out.println("**Second Program Output**");
		// 2. Write a Java program to insert an element into the array list at the first
		// and last positions.

		ArrayList<String> in = new ArrayList<String>();
		in.add("Rama");
		in.add("Krishna");

		for (int s = 0; s < in.size(); s++) {
			System.out.println(in.get(s));
		}

		in.add(0, "Venkata");
		in.add(3, "Ganesh");
		System.out.println("-----------");
		for (int s = 0; s < in.size(); s++) {
			System.out.println(in.get(s));
		}
		System.out.println("-----------");

		// 3. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.
		System.out.println("Name at Second Postion:" + " " + in.get(2));
		System.out.println("-----------");

		System.out.println("**Third Program Output**");
		// 4. Write a Java program to update specific array element by given element.

		in.set(2, "Murali");
		System.out.println("Name at Second Postion:" + " " + in.get(2));
		System.out.println("-----------");

		ArrayList<Object> accountDetails = new ArrayList<Object>();
		accountDetails.add("Sravan");
		accountDetails.add(32);
		accountDetails.add("8 Eglinton Ave");
		accountDetails.add(1001.22);
		accountDetails.add(true);

		for (Object e : accountDetails) {
			System.out.println(e);
		}

		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Fourth Program Output**");
		// How to replace one element value with other in an array list
		// Declaring ArrayList with literals
		ArrayList<String> colors1 = new ArrayList<String>(Arrays.asList("Red", "Yellow", "Green", "Purple"));
		// Printing an array with single syso statemnt
		System.out.println("Before setting or Replacing the element: " + colors1);
		colors1.set(2, "Pink");
		System.out.println("Before setting or Replacing the element: " + colors1);

		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Fifth Program Output**");
		// Write a program to print a part of array
		// assigning array elements with literals
		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four", "Five", "Six"));
		ArrayList<String> ar7 = new ArrayList<String>();
		int startIndex = 2, endIndex = 4, j = 0;

		for (int i = startIndex - 1; i <= endIndex; i++) {
			ar7.add(j, ar6.get(i));
			j++;
		}
		System.out.println("Original Array: " + ar6);
		System.out.println("Portion of the Array: " + ar7);

		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Sixth Program Output**");

		// Empty an array list

		ArrayList<String> ar8 = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four", "Five", "Six"));
		System.out.println("Before clearing " + ar8);
		ar8.clear();
		System.out.println("After clearing " + ar8);
		
		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Seventh Program Output**");
		//Write a program to search for an element in an array 
		ArrayList<String> al3 = new ArrayList<String>(Arrays.asList("One", "Two", "Three"));
		boolean b = al3.contains("Two");
		System.out.println(b);
		
		

		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Eight Program Output**");

		ArrayList<Integer> al1 =new ArrayList<Integer>(Arrays.asList(1,2,2,5,3,1,2,9,5,4,8,3,4));
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		Collections.sort(al1);
		int k=0;
		System.out.println("Original Array after sorting: "+al1);
		
		for (int i=0; i<al1.size()-1; i++) {
			for (int m=i+1; m<al1.size(); m++) {
				if(al1.get(i)==al1.get(m)) {
					al2.add(k, al1.get(m));
					k++;
					}				
			}		
		}			
		al1.removeAll(al2);
		System.out.println("Final array with unique elements: "+al1);
		
		System.out.println("");
		System.out.println("-----------");
		System.out.println("**Ninth Program Output**");
		//Write a program to pint sublist of an array using SubList method 
		ArrayList<Integer> al7 =new ArrayList<Integer>(Arrays.asList(1,2,2,5,3,1,2,9,5,4,8,3,4));
		System.out.println("Original Array: "+al7);
		System.out.println("Array with sublist from index 0 to 4: "+al7.subList(0, 4));
		
		
	}

}
