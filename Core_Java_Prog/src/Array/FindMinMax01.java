package Array;

public class FindMinMax01 {

	public static void main(String[] args) {

		int numbers[] = new int[] { 10, 5, 20, 25, 3, 12 };
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i : numbers) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
	}
}
