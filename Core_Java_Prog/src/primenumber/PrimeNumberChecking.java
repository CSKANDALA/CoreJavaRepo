package primenumber;

public class PrimeNumberChecking {

	public static void method1(int num) {

		int count = 0;
		int squareRoot=num/2;
		for (int i = 2; i <=squareRoot ; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

	public void method2() {

	}

	public static void main(String[] args) {
		// prime : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
		// not prime : 10,15,25
		PrimeNumberChecking.method1(5);
	}
}
