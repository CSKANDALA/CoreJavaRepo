package Array2;

import java.util.Arrays;

public class loop1 {
	public static void main(String args[]) {
		int[] numbers = new int[10];
		System.out.println(Arrays.toString(numbers));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += numbers[i];
		}System.out.println("sum : "+sum);
	}
}
