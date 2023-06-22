package Array;

public class Array_Adding {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int deta[] = { 5, 11, 14, 17, 20, 25 };
		
		for (int i = 0; i < deta.length; i++) {
			int x = deta[i];
			int y = deta[++i];
			System.out.println("values x :" + x + " y: " + y);
			a = y - x;
			System.out.println("difference between values : " + a);
			b = b + a;
		}
		System.out.println("sum of differences value------>" + b);
	}
}
