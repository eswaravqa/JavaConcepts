
package coreJava;
import java.util.Arrays;

public class RotateArrayFromAIndex {

		//First program with my own logic
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] originalArray = {55, 66, 77, 88, 99};
		int rotateFrom = 0; //this is index so from above array element 2 is 33(i.e index o is 11)
		int[] rotatedArray = new int[originalArray.length];
		int j=0, i=rotateFrom;
		
		while (i<=originalArray.length) {
			rotatedArray[j] = originalArray[i];
			i++;	
			j++;			
			if (i==originalArray.length) { i=0; }
			if (j==originalArray.length) break;				
		}
				
		//	System.out.println(originalArray.length);
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(rotatedArray));

	}

}
