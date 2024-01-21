package coreJava;

import java.util.Arrays;

public class PushAllZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] originalArray = {0,0,0,3,0,4,0,5,0,6};
		int[] updatedArray = new int[originalArray.length];
		int zerosCount=0;
		int m=0;
		
		//collect number of zeros
		for (int k=0; k<originalArray.length-1; k++) {
		if(originalArray[k]==0) {zerosCount++;}		
		}
		//Assign non zero elements to updatedArray
		for (int l=0;l<originalArray.length; l++) {
			if(originalArray[l]!=0) {
				updatedArray[m]=originalArray[l];
				m++;				
			}
		int lastElements=originalArray.length-zerosCount;
		
		//Assign last elements with zeros 
		while (lastElements<originalArray.length-1) {
			updatedArray[lastElements+1]=0;
			lastElements++;			
		}
		}
		//System.out.println(zerosCount);
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(updatedArray));		

	}
}
