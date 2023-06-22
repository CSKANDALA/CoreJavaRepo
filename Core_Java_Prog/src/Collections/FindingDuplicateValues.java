package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindingDuplicateValues {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();
		// List<String> list1 = Arrays.asList("1,2,4,5,4,3,4");
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("My List : " + list);
		System.out.println("Here are the duplicate elements from list : " + findDuplicates(list));
	}

	public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

		final Set<String> setToReturn = new HashSet<String>();
		final Set<String> set1 = new HashSet<String>();

		for (String yourInt : listContainingDuplicates) {
			if (set1.add(yourInt) == false) {
				setToReturn.add(yourInt);
			}
		}
		return setToReturn;
	}
}
