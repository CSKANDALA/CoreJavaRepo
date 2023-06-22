package String;

import java.io.*;
import java.util.*;

public class reverseString4 {

	public static void main(String[] args) {
		String input = "Be in present";

		// Method : 1
		String[] str = input.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			for (int j = str[i].length() - 1; j >= 0; j--) {
				System.out.print(str[i].charAt(j));
			}
			System.out.print(" ");
		}
		// Method : 2
		System.out.println();
		char[] hello = input.toCharArray();
		List<Character> trial1 = new LinkedList();
		for (char c : hello)
			trial1.add(c);
		Collections.reverse(trial1);
		ListIterator li = trial1.listIterator();
		while (li.hasNext()) {
			System.out.print(li.next());
		}
	}

}
