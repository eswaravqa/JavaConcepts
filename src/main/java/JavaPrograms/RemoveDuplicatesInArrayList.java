package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList1 = new ArrayList<Integer>(
				Arrays.asList(2, 3, 4, 5, 3, 6, 8, 2, 1, 7, 4, 9, 3, 0, 22, 33, 11));

		//1.Linked Hash Set method: Set family allows only unique values -- will NOT allow duplicates
		
		LinkedHashSet<Integer> linkedHashSetOne = new LinkedHashSet<Integer>(arrayList1);

		//ArrayList<Integer> arrayListNoDups = new ArrayList<Integer>(linkedHashSetOne);
	//	System.out.println(arrayListNoDups);
		
		System.out.println(linkedHashSetOne);
		
		//2.After JDK 8 Streams got introduced. Streams
		
		List<Integer> arrayListWithNoDups = arrayList1.stream().distinct().collect(Collectors.toList());		
		System.out.println(arrayListWithNoDups);
		
		

	}

}
