package coreJava;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*s.length() | s.trim() | s.charAt(0) |   s.indexOf("t")  |  s.indexOf("i", 3)
		s.replace("arg1", "arg2") | s.equals(s2) 
		s.contains("welcome") | S.split(“;“)
		s.substring(int startIndex) 
		s.substring(int startIndex, int endIndex)
		*/
		
		String s1 = "This is my first java program";
		
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf("java"));
		
		String s2 = "Hello World";
		if(s2.indexOf("World")>0) { 
			System.out.println("World word is found at: " + s2.indexOf("World") );
		}
		else {
			System.out.println("World word is not found");
		}
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		String startDate = "01-01-2024";
		System.out.println(startDate.replace('-', '/'));
		
		String s3 = "Hello how are you doing today?";
		System.out.println(s3.contains("doing"));
		
		String s4 = "  see u tmrw  ";
		System.out.println(s4.trim());
		
		String t1 = "Good Luck";
		String t2 = "good luck";
		System.out.println(t1.equals(t2)); //hard assertion
		System.out.println(t1.equalsIgnoreCase(t2));//soft assertion
		
		String colors = "Red_Green_Yellow_Orange";
		String[] colorsArray = colors.split("_");
		System.out.println(Arrays.toString(colorsArray));
		System.out.println(colorsArray[2]);
		
		String empData = "Rama;202;80 Irivin cre;01-01-1970;Perm";
		String[] empDataArray = empData.split(";"); //Split based on reg exp
		System.out.println(Arrays.toString(empDataArray));
		System.out.println(empData.split(";")[0]);
		System.out.println(empData.split(";")[1]);
		System.out.println(empData.split(";")[2]);
		System.out.println(empData.split(";")[3]);
		System.out.println(empData.split(";")[4]);	
		
		String s5 = "MyNameIsRaghavan";
		String[] s5array = s5.split("");
		System.out.println(Arrays.toString(s5array));
		for (int i=s5array.length-4; i<s5array.length; i++) {
			System.out.println(s5array[i]);
		}
		
		
		
		}

	}


