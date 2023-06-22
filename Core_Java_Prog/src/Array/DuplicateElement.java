package Array;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {

	public static void printDuplicateElements(int a[]) {
		System.out.print("duplicate elements : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
		System.out.println();
	}

	public static void removeDuplicateElements(int a[]) {
		List list = new ArrayList();
		for (int element : a) {
			if (!list.contains(element)) {
				list.add(element);
			}
		}
		System.out.println("After removing duplicate elements : " + list);
	}

	public static void main(String[] args) {
		// int a[] = { 2, 3, 5, 2, 2, 3 ,7};
		int a[] = { 4, 2, 4, 5, 2, 3, 1 };
		printDuplicateElements(a);
		removeDuplicateElements(a);

	}
}
