package JavaPrograms;

import java.util.Arrays;

//This program is not working fine
public class RemoveDuplicatesInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] originalArray = { 4, 4, 5, 7, 7, 6 };
		int[] updatedArray = new int[20];
		int index = 0;

		for (int i = 0; i < originalArray.length; i++) {
			int flag = 0;
			for (int j = 0; j < i; j++) {
				// System.out.println("i: "+originalArray[i]);
				// System.out.println("j: "+originalArray[j]);
				if (originalArray[i] == originalArray[j]) {
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				updatedArray[index] = originalArray[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(updatedArray));

		/*
		 * int j = 1; while (j < originalArray.length - 1) { if (originalArray[i] ==
		 * originalArray[j]) { System.out.println("Element: "+ j + " is Duplicate");
		 * break; } else { j++; } System.out.println("Element: "+i+
		 * " is not a duplicate"); updatedArray[k]=originalArray[i];
		 * 
		 * } System.out.println(Arrays.toString(originalArray));
		 * System.out.println(Arrays.toString(updatedArray));
		 */
	}

}
