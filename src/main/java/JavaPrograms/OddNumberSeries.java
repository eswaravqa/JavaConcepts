package JavaPrograms;

public class OddNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 30;
		for (int j = 1; j < number; j++) {
			if (j % 2 == 0)
				j++;
			for (int i = 1; i < j; i++) {
				if (i % 2 != 0) {
					System.out.print(i + ", ");
				}
			}
			System.out.println();
		}

	}
}
