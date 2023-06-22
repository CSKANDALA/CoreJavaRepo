package pre.testing;

public class OldTimeValue {
	private static long TEN_MINUTES = 10 * 60 * 1000;

	public static void main(String[] args) {

		long tenAgo = System.currentTimeMillis() - TEN_MINUTES;
		System.out.println("current time--->" + System.currentTimeMillis());
		System.out.println("ten minutes ago time===>" + tenAgo);
	}

}
