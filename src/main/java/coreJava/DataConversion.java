package coreJava;

public class DataConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="100";
		System.out.println(x+20);
		
		//String to Integer 
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		/*
		 * String y="100A"; int j = Integer.parseInt(y); System.out.println(j);//Number
		 * format exception for input string 100A
		 */
		
		//String to double 
		String p = "12.33";
		System.out.println(p+20);
		
		double d = Double.parseDouble(p);
		System.out.println(d+20);
		
		//int to string 
		int total = 100;
		String t = String.valueOf(total); //we can convert any type of data into String 
		System.out.println(t+20);
		
		//String to Boolean 
		String s = "hello";
		boolean b = Boolean.parseBoolean(s);
		System.out.println(b);
		
		String g="true";
		if(Boolean.parseBoolean(g)) {System.out.println("PASS");}		
		

	}

}
