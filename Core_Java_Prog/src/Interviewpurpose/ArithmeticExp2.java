package Interviewpurpose;

public class ArithmeticExp2 {

	int a = 2;
	int b = 0;
	int c;

	void method() {

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error" + e);
		}
	}

	public static void main(String args[]) {
		ArithmeticExp2 e = new ArithmeticExp2();
		e.method();
	}
}
