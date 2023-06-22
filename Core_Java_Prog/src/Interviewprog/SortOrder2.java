package Interviewprog;

import java.util.Scanner;

public class SortOrder2 {

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

		System.out.print("After Sorting in Given order: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.print("After Sorting in Reverse order: ");
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(" " + arr[i]);
		}

	}
}
