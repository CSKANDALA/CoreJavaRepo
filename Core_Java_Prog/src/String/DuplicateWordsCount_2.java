package String;

import java.util.*;

public class DuplicateWordsCount_2 {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		String msg = "kesava,chandra,kesava,kesava,KESAVA";
		String msgLowerCase = msg.toLowerCase();
		 //String msgUpperCase=msg.toUpperCase();

		String[] s1 = msgLowerCase.split(",");
		for (String s2 : s1) {

			if (hm.containsKey(s2)) {
				hm.put(s2, hm.get(s2) + 1);
			} else {
				hm.put(s2, 1);
			}
		}
		System.out.println("--->Words with count : " + hm);

		Set<String> wordsInString = hm.keySet();

		for (String word : wordsInString) {
			if (hm.get(word) > 1) {
				System.out.println(word + " : " + hm.get(word));
			}
		}
	}
}
