package Array;

import java.util.Arrays;
import java.util.*;

public class ReverseValues {
	public static void main(String args[]) {

		Integer[] array = { 1, 4, 9, 16, 9, 7, 4, 9, 11 };

		List<Integer> list = Arrays.asList(array);
		System.out.print(list);
		System.out.println();
		// method-1
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// methos-2
		Collections.reverse(list);
		System.out.print(list);

	}

}
