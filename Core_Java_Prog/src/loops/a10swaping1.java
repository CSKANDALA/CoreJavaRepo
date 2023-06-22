package loops;

public class a10swaping1 {
	public static void main(String[] args) {
		int x = 10, y = 20, z;
		System.out.println("before swapping : " + x + " and " + y);
		z = x;
		x = y;
		y = z;
		System.out.println("after swapping  : " + x + " and " + y);
	}
}
