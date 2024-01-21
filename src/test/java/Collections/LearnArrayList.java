package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class LearnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Basic Array List (Generics String)
		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Apple");
		fruitList.add("Guva");
		fruitList.add("Cherry");
		fruitList.add("Orange");

		System.out.println("****Simple Array List****");		
		for (String e : fruitList) {
			System.out.println(e);
		}

		// Arraylist with different Generics can be done via Objects
		ArrayList<Object> studentData = new ArrayList<Object>();
		studentData.add("Lavanya Tripathi");
		studentData.add(6);
		studentData.add(1002.34);
		studentData.add("Perumal Street");

		System.out.println("****Object Array List****");		
		for (Object e : studentData) {
			System.out.println(e);
		}

		// Defining Arrays inside the declaration
		ArrayList<String> carMakers = new ArrayList<>(Arrays.asList("Toyota", "Honda", "Nissan", "Mazda", "Subaru"));
		System.out.println("****Array List add in declaration****");		
		System.out.println(carMakers); // Here no need to have for loop to display ArrayList. AL values will be
										// displayed as Array

		// Static Array to display in single array without a loop
		int i[] = { 10, 20, 30, 40 };
		System.out.println(i); // This will print the memory reference of ' i ' but not array
		System.out.println("****Static Array****");		
		System.out.println(Arrays.toString(i));

		ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 6, 5, 4, 3));
		ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(2, 2, 7, 8, 4, 3));

		// Before Sorting
		System.out.println("****Before Sorting****");
		System.out.println(l1);
		// After Sorting
		Collections.sort(l1);
		System.out.println("****After Sorting****");
		System.out.println(l1);
		
		//Compare two Array List : Gives Boolean output (true/false)
		System.out.println("****Compare Two Array List");
		System.out.println(l1.equals(l2));
		
		//Arraylist -- with Generics as a class 
		
			//Define elements in CarDetails constructor 
			CarDetails cd1 = new CarDetails("Toyota", 2, "RAV4", 3500.24);
			CarDetails cd2 = new CarDetails("Honda", 4, "CR-V", 3802.68);
			CarDetails cd3 = new CarDetails("Nissan", 2, "ROUGE", 2800.02);
			CarDetails cd4 = new CarDetails("Mazda", 4, "CX-5", 3490.88);
			
			//Create arraylist
			ArrayList<CarDetails> cdal = new ArrayList<CarDetails>();
			//add elements 
			cdal.add(cd1);
			cdal.add(cd2);
			cdal.add(cd3);
			cdal.add(cd4);
			
			//Iteration to fetch and print the values 
			Iterator<CarDetails> it = cdal.iterator();
			while (it.hasNext()) {
				CarDetails cd = it.next();
				System.out.println(cd.carMaker);
				System.out.println(cd.carWheelDrive);
				System.out.println(cd.carModel);
				System.out.println(cd.carPrice);
				System.out.println("-------------");
			}
			
			//Add one array list to other : 
			ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(1, 2, 6, 5, 4, 3));
			ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(8, 9, 10));
			
			l3.addAll(l4);
			
			//Iterate and Print : For each loop 
			//for (Integer e : l3) {
				//System.out.println(e);
			//}
			
			//Iterate and Print 
			for (int s=0; s<l3.size(); s++) {
				System.out.println(l3.get(s));
			}
			
			//Remove all odd numbers from list 
			ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
			System.out.println("*****Print Even Numbers******");
			numList.removeIf(n -> n%2 == 0);
			System.out.println(numList);
			System.out.println("*****Print Odd Numbers******");
			ArrayList<Integer> numList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
			numList1.removeIf(n -> n%2 == 1);
			System.out.println(numList1);
			
			//subList Method 
			System.out.println("*****Print sub list******");
			ArrayList<Integer> numList2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
			ArrayList<Integer> subList = new ArrayList<Integer>(numList2.subList(3,8));
			System.out.println(subList);
			
			//singleton method 
			System.out.println("*****Demo Singleton method******");
			ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Rama", "Venkata", "Siva", "Sankara", "Rama"));
			nameList.retainAll(Collections.singleton("Rama"));
			System.out.println(nameList);
			
			//Clone array list 
			ArrayList<String> cloneList =  (ArrayList<String>)nameList.clone();
			System.out.println("*****Clone List******");
			System.out.println(cloneList);
			
			//To Array method: Converts array to a string 
			ArrayList<String> nameList4 = new ArrayList<>(Arrays.asList("Rama", "Venkata", "Siva", "Sankara"));
			
			//following statement will convert array nameList4 to object single dimensional array 
			Object arr[] = nameList4.toArray();
			System.out.println(Arrays.toString(arr));  // this line will still print objects as still single dimentional arry 
			
			System.out.println("*****Convert array to string******");
			for (Object o : arr ) {
				System.out.println(o);  // This line will print each array element as object 
			}
			
			//System.out.println((String)o);  // This will convert each object element to string, so that we can do any string related operations 
			
			
			
			
			
				
			
			
		
		

	}

}
