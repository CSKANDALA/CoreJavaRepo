package Interviewprog;

import java.util.Scanner;

public class SortOrder {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < size; i++) {
			System.out.print("Element No. " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.print("Before Sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();

		for (int i = 0; i < size; i++) {
			int temp;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("After Sorting in ascending order: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.print("After Sorting in descending order: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(" " + arr[i]);
		}
	}
}
