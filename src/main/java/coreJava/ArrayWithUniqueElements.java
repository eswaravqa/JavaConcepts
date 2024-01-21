package coreJava;

import java.util.ArrayList;

public class ArrayWithUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arL1 = new ArrayList<Integer>();

		arL1.add(10);//0
		arL1.add(20);//1
		arL1.add(10);//2
		arL1.add(20);//3
		arL1.add(40);//4

		ArrayList<Integer> arL2 = new ArrayList<Integer>();

		for (int i = 0; i < arL1.size(); i++) {			
			int k = 0;
			for(int j = i + 1; j < arL1.size(); j++) {					
				if (arL1.get(i) == arL1.get(j)) {
					System.out.println("Element : " + arL1.get(i) + " is duplicate");
					k++;					
				}			
			}
			if (k == 0) {
				arL2.add(arL1.get(i));
				}
		}
		
		

		for (Integer e : arL1) {
			System.out.println(e);
		}
		System.out.println("---------------");

		for (Integer g : arL2) {
			System.out.println(g);
		}
		
		
		

	}

}
