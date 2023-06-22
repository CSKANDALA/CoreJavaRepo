package loops;

public class Pattern16 {

	public static void main(String[] args) {
		int i = 0, j, k = 0;
		for (j = 1; j < 5; j++) {
			k = i + j;
			System.out.println(i + " " + j + " " + k);
			i += j;
		}
	}
}
