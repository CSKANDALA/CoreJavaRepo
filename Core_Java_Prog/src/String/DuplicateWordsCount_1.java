package String;

import java.util.*;

public class DuplicateWordsCount_1 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String msg = "kesava,chandra,kesava,kesava";

		String[] s1 = msg.split(",");
		for (String s2 : s1) {

			if (hm.containsKey(s2)) {
				hm.put(s2, hm.get(s2) + 1);
			} else {
				hm.put(s2, 1);
			}
		}
		System.out.println("--->Words with count : " + hm);

	}
}
