package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String actualString = "HELLO GO";
		String reversedString = "";
		
		for (int i=actualString.length()-1; i>=0; i--) {
			reversedString = reversedString+actualString.charAt(i);
		}
		
		System.out.println("Reversed Sring: "+reversedString);
		

	}

}
