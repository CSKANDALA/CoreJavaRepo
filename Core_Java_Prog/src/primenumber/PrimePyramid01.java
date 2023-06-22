package primenumber;

public class PrimePyramid01 {
	public static void main(String[] args) {

		int rows = 5;
		int k;
		int count;
		int p = 2;
		for (int i = 1; i <= rows; i++) {
			
			for (int s = 1; s <= rows - i; s++) {
				System.out.print("   ");
			}
			
			k = 0;
			while (k != 2 * i - 1) {
				count = 0;
				for (int x = 2; x <= p / 2; x++) {
					if (p % x == 0) {
						count++;
					}
				}
				if (count == 0) {
					System.out.print(p + " ");
					k++;
				}
				p++;
			}

			System.out.println();
		}

	}
}
