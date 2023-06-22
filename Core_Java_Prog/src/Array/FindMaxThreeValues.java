package Array;

import java.util.Arrays;

public class FindMaxThreeValues {

	private static int[] getThreeHighest(int[] array) {

		int[] highestValues = new int[3];
		// Arrays.fill(highestValues, Integer.MIN_VALUE);
		
		for (int n : array) {
			if (n > highestValues[0]) {
				highestValues[0] = n;
				Arrays.sort(highestValues);
			}
		}
		return highestValues;
	}

	public static int[] getSortedData(int[] myArray) {
	    Arrays.sort(myArray);
		return myArray;
	}
	
	public static void main(String[] args) {
		// int[] myArray = { 4,62,17,10,19,49 };
		int[] myArray = { 400, 2, 17, 100, 19, 49 };
		System.out.println("Sorted data"+Arrays.toString(getSortedData(myArray)));
		System.out.println("All values : " + Arrays.toString(myArray));
		System.out.println(
				"highest three values from an unsorted Integer array : " + Arrays.toString(getThreeHighest(myArray)));
	}
}
