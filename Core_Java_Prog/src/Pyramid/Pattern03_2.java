package Pyramid;

public class Pattern03_2 {

	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int space = 1; space <= rows - i; space++) {
				System.out.print("  ");
			}
			int printDataCount = 2 * i - 1;
			for (int j = 1; j <= printDataCount; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}
