package Interviewpurpose;

public class exception2 {
	public static void main(String args[]) {

		int a = 2;
		int b = 0;

		try {
			if (a / b == 0) {
				System.out.println("A");
			}
		} catch (ArithmeticException e) {
			System.out.println("B");
		} catch (Exception A) {
			System.out.println("C");
		} finally {
			System.out.println("D");
		}
		System.out.println("E");
	}
}
