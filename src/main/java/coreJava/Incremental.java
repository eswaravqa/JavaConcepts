package coreJava;

public class Incremental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		int b=0;
		b= a++ + ++a * --a - a--;
		System.out.println(a);
		System.out.println(b);
		
		int i=19, j=29, k=0;
		int m=i-- - j-- - k--;
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("k="+k);
		System.out.println("m="+m);

	}

}
