package Interviewpurpose;

public class forloop {
	public static void main(String args[]) {

		for (int i = 4; i >= 0; i -= 2) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
		System.out.print("*");
	}
}
