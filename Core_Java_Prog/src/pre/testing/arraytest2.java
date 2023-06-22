package pre.testing;

import java.util.Arrays;

public class arraytest2 {
	public static void main(String[] args) {

		int count = 10;
		int total = 0;
		int[] numbers = new int[count];

		for (int i = 0; numbers.length > i; i++) {
			numbers[i] = i + 1;
			total += i + 1;
		}
		System.out.println("-------->" + numbers.length + ",," + Arrays.toString(numbers) + " total :" + total);
	}
}
