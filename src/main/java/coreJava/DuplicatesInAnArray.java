package coreJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] array1 = {"good", "one", "two", "good", "bye", "one", "same", "two", "sare", "one"};
		
		//1.Brute Force 		
		System.out.println("*********2.Brute Force*********");
		for (int i=0; i<array1.length; i++) {
			for (int j=i+1; j<array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i] + ": Is duplicate");					
				}
				
			}
		}
		
		//2.HashSet:  Hash set will not allow duplicate values 		
		System.out.println("*********2.HashSet*********");
		Set<String>  data = new HashSet<String>();
		for (String e: array1 ) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}
		
		//3.HashMap 		
		System.out.println("*********3.HashMap*********");
		HashMap<String, Integer> array1Map = new HashMap<String, Integer>();		
		for (String e : array1) {
			Integer count = array1Map.get(e);
			if (count == null) {
				array1Map.put(e, 1);
			}
			else {
				array1Map.put(e, ++count);
			}
			
		}
		
		Set<Entry<String, Integer>> entrySet = array1Map.entrySet();
		for ( Entry<String, Integer> en : entrySet) {
			System.out.println(en.getKey() + " : " + en.getValue());	
		}
			
		

	}

}
