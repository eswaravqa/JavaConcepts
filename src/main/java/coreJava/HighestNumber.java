package coreJava;

public class HighestNumber {

	public static void main(String[] args) {
			
		//How to compare 4 variables and print the highest?
		int aa=40, bb=30, cc=10, dd=20;
		
		if(aa>bb && aa>cc && aa>dd) {
			System.out.println("aa is the highest");
		} else if( bb>aa && bb>cc && bb>dd) {
			System.out.println("bb is the highest");
		} else if(cc>aa && cc>bb && cc>dd) {
			System.out.println("cc is the highest");
		} else  {
			System.out.println("dd is the highest");
		}

	}

}
