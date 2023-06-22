package Interview;

public class Valuetest {

	int test(int a) {
		System.out.println("test 2 : " + a);
		a = 30;
		System.out.println("test 3 : " + a);
		return a;
	}

	public static void main(String args[]) {

		Valuetest obj = new Valuetest();
		int a = 50;
		System.out.println("test 1 : " + a);
		int c = obj.test(a);
		System.out.println("test 4 : " + c);

	}
}
