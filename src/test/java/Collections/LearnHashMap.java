package Collections;

import java.util.HashMap;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Basic Hash Map is Key Value definition 
		HashMap<Integer, String> stdInfo = new HashMap<Integer, String>();
		stdInfo.put(10, "Bala");
		stdInfo.put(11, "Chinna");
		stdInfo.put(12, "Deva");
		stdInfo.put(13, "Eswar");
		stdInfo.put(14, "Farah");
		stdInfo.put(15, "Eswar");
		stdInfo.put(16, "Farah");
		stdInfo.put(17, null);
		stdInfo.put(18, null);
		stdInfo.forEach((m,n) -> System.out.println(m+" : "+n));
		
		//1.Duplicate key values are allowed 2.null values are allowed 
		//3.Duplicate null values are allowed 4.There is no indexing for HashMap
		//Size of HashMap
		System.out.println(stdInfo.size());
		//Print a particular key 
		System.out.println(stdInfo.get(10));
		System.out.println(stdInfo.get(null));		
		
	}

}
