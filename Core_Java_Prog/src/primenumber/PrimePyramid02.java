package primenumber;

public class PrimePyramid02 {

	public static void main(String ar[]) {

		int k, prime = 2, count = 0, row = 5;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			k = 1;
			while (k <= i) {
				count = 0;
				for (int a = 2; a <= prime / 2; a++) {
					if (prime % a == 0) {
						count++;
					}
				}
				if (count == 0) {
					System.out.print(prime + "  ");
					k++;
				}
				prime++;
			}
			System.out.println();
		}
	}

}
