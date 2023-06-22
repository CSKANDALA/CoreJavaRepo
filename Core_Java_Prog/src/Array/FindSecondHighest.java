package Array;

public class FindSecondHighest {

	private static int secondHighest(int[] array) {
		int highest = 0;
		int secondHighest = 0;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

	public static void main(String[] args) {
		int[] array = { 6, 0, 9, 1, 7 };
		int result = secondHighest(array);
		System.out.println("result : " + result);

	}
}
