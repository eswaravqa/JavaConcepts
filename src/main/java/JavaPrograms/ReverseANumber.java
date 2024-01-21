package JavaPrograms;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int a = 45678;
		int revNum=0;
		
		System.out.println("Number: "+a);
		
		while(a!=0) {
			revNum = revNum*10 + a%10;
			a=a/10;
		}
		
		System.out.println("Reverse Number: "+ revNum);
		
		

	}

}
