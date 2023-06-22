package Array;

import java.util.Arrays;

public class SortData {

	public static void method1(int[] unSortedData) {
		int temp, i;
		for (i = 0; i < unSortedData.length; i++) {
			temp = 0;
			for (int j = i + 1; j < unSortedData.length; j++) {
				if (unSortedData[i] > unSortedData[j]) {
					temp = unSortedData[i];
					unSortedData[i] = unSortedData[j];
					unSortedData[j] = temp;
				}
			}
		}
		System.out.println("Method 1 : " + Arrays.toString(unSortedData));
	}

	public static void method2(int[] unSortedData) {
		Arrays.sort(unSortedData);
		System.out.println("Method 2 : " + Arrays.toString(unSortedData));
	}

	public static void stringSort() {
		String s = "avasek";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
		System.out.println("String Sort : " + Arrays.toString(ch));

	}

	public static void main(String[] args) {
		int[] unSortedData = { 4, 3, 6, 9, 10, 1 };
		method1(unSortedData);
		method2(unSortedData);
		stringSort();
	}
}
