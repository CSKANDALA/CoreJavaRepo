package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TopTenValuesFromTwoLists {
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.addAll(Arrays.asList(1, 3, 10, 20, 35, 40));

		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.addAll(Arrays.asList(2, 5, 15, 25, 30, 45));

		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(a1);
		newList.addAll(a2);
		Collections.sort(newList);

		List<Integer> mimimumValues = newList.subList(0, 10);
		System.out.println("Smallest 10 Values : " + mimimumValues);

		Collections.reverse(newList);

		List<Integer> maximumValues = newList.subList(0, 10);
		System.out.println("Largest 10  Values : " + maximumValues);

	}
}
