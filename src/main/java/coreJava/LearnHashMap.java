package coreJava;

import java.util.HashMap;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> empInfo = new HashMap<Integer, String>();
		
		empInfo.put(1001, "Rama");
		empInfo.put(1002, "Laxmana");
		empInfo.put(1003, "Bharata");
		empInfo.put(1004, "Satrughna");
		empInfo.put(null, "Sita");
		empInfo.put(1006, "Hanuma");
		empInfo.put(1005, "Lakshmana");
		
		
		System.out.println(empInfo.get(1001));
		
		System.out.println(empInfo.get(null));
		System.out.println(empInfo.get(1002));
		
		System.out.println("---------");
		empInfo.forEach((k, v) -> System.out.println(k + " : "+v));
		System.out.println("---------");
		

	}

}
