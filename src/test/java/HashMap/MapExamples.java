package HashMap;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> empData = new HashMap<Integer, String>();
		empData.put(100, "Ram");
		empData.put(101, "Ramana");
		empData.put(102, "Satya");
		empData.put(103, "Venkata");
		
		empData.forEach((m,n) -> System.out.println(m+" : "+n));

	}

}
