package pre.testing;

public class arraytest {
	public static void main(String[] args) {

		int[] deta = { 5, 11, 14, 17, 20, 25 };
		int b = 0;
		for (int i = 0; i < deta.length; i++) {

			int x = deta[i];
			int y = deta[++i];
			System.out.println("values x: " + x + " y : " + y);
			int a = y - x;
			System.out.println("difference=====>" + a);
			b = b + a;
			System.out.println("sum of differences------->" + b);
		}

	}
}
