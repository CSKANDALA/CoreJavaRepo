package String;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersCount {

	public static void main(String[] args) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		String msg = "JavaJ2EE";
		//String msgLowerCase = msg.toLowerCase();
		// String msgUpperCase=msg.toUpperCase();

		char[] chracters=msg.toCharArray();
		for (char chracter : chracters) {

			if (hm.containsKey(chracter)) {
				hm.put(chracter, hm.get(chracter) + 1);
			} else {
				hm.put(chracter, 1);
			}
		}
		System.out.println("Chracters with count : " + hm);

		Set<Character> chracterSet = hm.keySet();

		for (Character chracter : chracterSet) {
			if (hm.get(chracter) > 1) {
				System.out.println("Duplicate chracters --->"+chracter + " : " + hm.get(chracter));
			}
		}
	}
}
