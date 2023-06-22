package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		// Sort s1 values and find sum of even values in s1
		String s1 = "1;10;3;15;5";
		String[] s2 = s1.split(";");
		
		List<Integer> list = new ArrayList<Integer>();
		for (String s : s2) {
			list.add(Integer.valueOf(s));
		}
		Collections.sort(list);
		String SortedOrder = "";
		int result = 0;
		
		for (int i = 0; i < list.size(); i++) {
			SortedOrder += String.valueOf(list.get(i)) + ";";
			if (list.get(i) % 2 != 0) {
				result += Integer.valueOf(list.get(i));
			}
		}
		System.out.println("--->Input Sorted Order : " + SortedOrder.substring(0, SortedOrder.length() - 1));
		System.out.println("===>Sum of input even values : " + result);
	}
}
