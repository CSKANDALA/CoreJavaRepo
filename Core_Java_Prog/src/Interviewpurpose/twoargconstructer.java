package Interviewpurpose;

public class twoargconstructer {

	public static void main(String args[]) {

		twoargconstructer t = new twoargconstructer(10, 20);
		twoargconstructer t1 = new twoargconstructer(10.0, 20);
	}

	twoargconstructer(int a, int b) {
		System.out.println("case 1 : " + a + ", " + b);
	}

	twoargconstructer(double a, double b) {
		System.out.println("case 2 : " + a + ", " + b);
	}
}
