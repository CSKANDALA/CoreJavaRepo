package loops;

public class pattern03_c1 {

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}