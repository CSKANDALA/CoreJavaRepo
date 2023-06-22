package generalconcepts;

public class Palindrome {

	public static  void method1_ForLettersAndNumbers() {
		String s = "1234321";
		// String s = "abcdcba";
		int a = 0;
		char[] c = s.toCharArray();
		for (int i = 0; i < (c.length / 2); i++) {
			if (c[i] != c[c.length - (i + 1)]) {
				System.out.println("Given String is not palindrome");
				a++;
				break;
			}
		}
		if (a == 0) {
			System.out.println("Given String is palindrome");
		}
	}

	public static void method2_ForNumbers() {

		int num = 151;
		int rmd;
		int reverse = 0;
		int n = num;
		while (num > 0) {
			rmd = num % 10;
			reverse = reverse * 10 + rmd;
			num = num / 10;
		}
		if (reverse == n)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not a palindrome");

	}

	public static void main(String[] args) {
		//method1_ForLettersAndNumbers();
		method2_ForNumbers();
	}
}
