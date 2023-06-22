package loops;

public class Pattern17 {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 1; i <= 4; i++) {
			j = j + i;
			for (int k = i; k <= j; k++) {
				System.out.print(k + " ");
			}
			i = j;
			System.out.println(" ");
		}
	}

}
