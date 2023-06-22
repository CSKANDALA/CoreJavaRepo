package Pyramid;

public class Pattern03_1 {

	public static void main(String[] args) {
		int rows = 5, k, a = 2;

		for (int i = 1; i <= rows; i++) {
			k = 0;
			for (int space = 1; space <= rows - i; space++) {
				System.out.print("  ");
			}

			while (k != 2 * i - 1) {
				System.out.print("* ");
				//System.out.print(i+" ");
				k++;
			}

			System.out.println();
		}
	}
}
