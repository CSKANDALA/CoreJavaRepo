package Interviewpurpose;

public class Test {
	int x = 2;

	Test(int i) {
		x = i;
		System.out.println(x);
	}

	public static void main(String[] args) {
		Test t = new Test(5);
		System.out.println("x = " + t.x);
	}

}
