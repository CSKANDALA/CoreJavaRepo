package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAndReverse {
	public static void main(String args[]) {

		Integer[] ints = { 10, 20, 5, 55 }; // Get the input from user and for an Integer array
		List<Integer> list = Arrays.asList(ints);
		System.out.println("Input            : " + list);
 
		Collections.reverse(list);
		System.out.println("Reverse Order    : " + list);

		Collections.sort(list);
		System.out.println("Ascending Order  : " + list);

		Collections.reverse(list);
		System.out.println("Descending Order : " + list);
	}

}
