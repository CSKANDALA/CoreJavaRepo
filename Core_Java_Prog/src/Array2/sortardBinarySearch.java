package Array2;

import java.util.Arrays;

public class sortardBinarySearch {
	
	public static void main(String args[]) throws Exception {
		
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Arrays.sort(array);
		System.out.println("Sorted array : " + Arrays.toString(array));
		int index = Arrays.binarySearch(array, 2);
		System.out.println("Found 2 @ " + index);
	}

}
