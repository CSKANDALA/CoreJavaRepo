package Collections;

import java.util.*;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(14);
		arrayList.add(7);
		arrayList.add(39);
		arrayList.add(40);
		// Collections.sort(arrayList);
		for (int s : arrayList) {
			System.out.println(s);
		}

	}
}