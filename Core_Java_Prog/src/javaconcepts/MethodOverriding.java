package javaconcepts;

public class MethodOverriding extends MethodOverloding {

	void method(int a, int b) {
		System.out.println("The sub is:" + (a - b));
	}

	public static void main(String[] args) {
		MethodOverriding oriding = new MethodOverriding();
		oriding.method(70, 50);

	}
}
