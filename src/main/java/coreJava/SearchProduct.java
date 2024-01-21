package coreJava;

import java.util.ArrayList;

public class SearchProduct {
	
	public ArrayList<String> searchProdCat(String categoryName) {
		
		ArrayList<String> carList = new ArrayList<String>();
		
		switch (categoryName) {
		case "Audi":
			carList.add("Q5");
			carList.add("Q7");
			carList.add("SQ5");
			carList.add("eTron");			
			break;
		case "BMW":
			carList.add("X3");
			carList.add("X5");
			carList.add("X1");			
			break;			
		case "Merc":
			carList.add("GLC300");
			carList.add("GLC500");
			carList.add("GLE200");
			carList.add("McLauren");
			carList.add("GLA500");
			break;

		default:
			System.out.println("Category not found. Please enter correct string");
			break;
		}
		
		return carList;	
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchProduct s1 = new SearchProduct();
		ArrayList<String> audiCarsList = s1.searchProdCat("Audi");
		System.out.println(audiCarsList.size());
		System.out.println(audiCarsList);
		
		SearchProduct s2 = new SearchProduct();
		ArrayList<String> mercCarsList = s2.searchProdCat("Merc");
		System.out.println(mercCarsList.size());
		System.out.println(mercCarsList);
		for (String e: mercCarsList ) {
			System.out.println(e);
		}
		

	}

}
