package JavaPrograms;

public class PalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To check if a number is palindrome or not

		int b = 16461;
		int c = b;
		int rev = 0;

		System.out.println("Number: " + b);

		while (b != 0) {
			rev = rev * 10 + b % 10;
			b = b / 10;
		}

		System.out.println("Reverse Number: " + rev);

		if (c == rev) {
			System.out.println("Number is Palindrom");
		} else {
			System.out.println("Number is not Palindrom");
		}

	}

}
