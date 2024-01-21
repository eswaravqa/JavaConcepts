package coreJava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"good", "one", "two", "good", "bye", "one", "same", "two", "sare", "one"};
		
		HashMap<String, Integer> array1Map = new HashMap<String, Integer>();		
		for (String b : array1) {
				Integer count = array1Map.get(b);
			if (count == null) {
				array1Map.put(b, 1);		
				}
			else {
				array1Map.put(b, ++count);
			}
		}
		
		Set<Entry<String, Integer>> enSet = array1Map.entrySet();
		
		for ( Entry<String, Integer> en : enSet){
			System.out.println(en.getKey() + " : " + en.getValue());
		}
		
		
		
		
		
		
		
	}

}
