package loops;

public class a07factorialusingrecursion {

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			System.out.println(n);
		return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		int fact = 1;
		int number = 3;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is :" + fact);

	}

}
