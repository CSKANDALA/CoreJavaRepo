package javaconcepts;

public class MethodOverloding {
	void method(int i, int j) {
		System.out.println("The sum is:" + (i + j));
	}

	void method(int b) {
		System.out.println("The sum is:" + b);
	}

	public static void main(String[] args) {
		MethodOverloding i = new MethodOverloding();
		i.method(10, 20);
		i.method(30);
	}
}
