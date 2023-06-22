package co.in.practice;

public class p1 {

	public static void main(String[] args) {

		int rows = 10;
		for (int i = 1; i < rows; i+=2) {

			for (int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k+" ");
			}

			System.out.println();
		}

	}
}
