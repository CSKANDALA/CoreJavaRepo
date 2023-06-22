package loops;

public class a06factorial {
	public static void main(String[] args) {

		int a = 3, fact = 1;
		for (int i = 1; i <= a; i++) {
			// fact = fact * i;
			fact *= i;
		}
		System.out.print("factorial of "+a+" -> " + fact);
	}
}
