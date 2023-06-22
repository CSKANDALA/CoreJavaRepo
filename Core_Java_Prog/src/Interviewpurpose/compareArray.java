package Interviewpurpose;

import java.util.Arrays;

public class compareArray {

	public static void workingMethod_1(int array1[], int array2[]) {
		if (Arrays.equals(array1, array2)) {
			System.out.println("Method_1 : Same");
		} else {
			System.out.println("Method_1 : Not Same");
		}
		System.out.println(array1[0] == array2[0] && array1[1] == array2[1]);
	}

	public static void workingMethod_2(int array1[], int array2[]) {
		array1 = array2;
		if (array1.equals(array2)) {
			// if (array1 == array2) // Same as arr1.equals(arr2)
			System.out.println("Method_2 : Same");
		} else {
			System.out.println("Method_2 : Not same");
		}
		System.out.println(array1[0] == array2[0] && array1[1] == array2[1]);
	}

	public static void notWorkingMethod(int array1[], int array2[]) {
		if (array1.equals(array2)) {
			System.out.println("Method_3 : Same");
		} else {
			System.out.println("Method_3 : Not same");
		}
		System.out.println(array1[0] == array2[0] && array1[1] == array2[1]);
	}

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3 };
		int array2[] = { 1, 2, 3 };
		workingMethod_1(array1, array2);
		workingMethod_2(array1, array2);
		notWorkingMethod(array1, array2);

	}
}