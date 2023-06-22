package Array;

import java.util.Arrays;

public class removedupusingarray {

	public static int[] removeDuplicates(int[] input) {
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		/*
		 * if(input.length < 2){ return input; }
		 */
		System.out.println("length : " + input.length);
		while (i < input.length) {
			System.out.println("before condition : " + input[j] + ", "
					+ input[i]);
			if (input[i] == input[j]) {
				System.out.println("inside if : " + input[i] + ", " + input[j]);
				i++;
			} else {
				int a = input[++j];
				int b = input[i++];
				a = b;
				System.out.println("inside else : " + a + ", " + b);
			}
		}
		int[] output = new int[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}
		return output;
	}

	public static void main(String a[]) {
		// int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
		// int[] input1 = {1,2,3,3,5,5,5};
		int[] input1 = { 2, 3, 2, 2, 3 };
		// System.out.println("out : "+Arrays.toString(removeDuplicates(input1)));
		int[] output = removeDuplicates(input1);
		for (int i : output) {
			System.out.print(i + " ");
		}
	}

}
