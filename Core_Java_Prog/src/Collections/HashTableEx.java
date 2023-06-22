package Collections;

import java.util.*;
import java.util.Map.Entry;

public class HashTableEx {
	public static void main(String args[]) {
		//Not Allows null values
		//Key DeAscending order
		Hashtable<Integer, String> hm1 = new Hashtable<Integer, String>();

		hm1.put(1, "kesava");
		hm1.put(2, "kesava");
		hm1.put(3, "venkat");
		hm1.put(3, "kiran");
		hm1.put(4, "chandra");
		//hm1.put(null, "DON");
		//hm1.put(null, "DON2");

		for (Entry<Integer, String> m : hm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
