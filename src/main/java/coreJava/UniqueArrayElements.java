package coreJava;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] dupes = {0, 1, 2, 1, 3, 2, 3};
		  int[] uniques = Arrays.stream(dupes) // stream ints
		      .boxed()                         // make Integer of int
		      .collect(Collectors.toSet())     // collect into set to remove duplicates
		      .stream()                        // stream Integers
		      .mapToInt(Integer::intValue)     // make int of Integer
		      .toArray();                      // and back into an array

		  System.out.println(Arrays.toString(uniques));
		}
	}


