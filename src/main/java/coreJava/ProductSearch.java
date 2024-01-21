package coreJava;
import java.util.*;

public class ProductSearch {
	
	public ArrayList<String> doSearch(String categoryName) {
		System.out.println("Searching for the product :"+ categoryName);
		ArrayList<String> prodList = new ArrayList<String>();				
		
		switch (categoryName) {
		case "Apple":
			prodList.add("iphone12");
			prodList.add("ipad mini");
			prodList.add("macbook pro");
			prodList.add("mac mini");
			break;
		case "Samsung":
			prodList.add("samsung tv");
			prodList.add("S22");
			prodList.add("samsung laptop");
			prodList.add("samsung tablet");
			break;
		case "hp":
			prodList.add("hard disk");
			prodList.add("printer");
			prodList.add("hp laptop");
			prodList.add("hp keyboard");
			break;
		case "coca cola":
			prodList.add("diet coke");
			prodList.add("Sprint");
			prodList.add("strawberry coke");
			break;
		default:
			System.out.println("Unable to find the product :"+ categoryName);
			break;
		}
		
		return prodList;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ProductSearch c1 = new ProductSearch();
		
		ArrayList<String> appleList = c1.doSearch("Apple");
		System.out.println("Number of Apple products found : "+ appleList.size());
		System.out.println(appleList);
		System.out.println("-------------");
				
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println("Number of Samsung products found : "+ samsungList.size());		
		for(String e : samsungList) {
			System.out.println(e);
		}
		System.out.println("-------------");
		
		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println("Number of Nokia products found: "+ nokiaList.size());
		for (String e : nokiaList) {
			System.out.println(e);
		}
		
	
	}
}
		
		


