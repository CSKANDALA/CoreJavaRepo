package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapKeyCheck {

	public static void main(String[] args) {
		// not follow order
		/**
		 * 1)Not follow any order
		 * 2)Allows null key and values
		 * 3)Non synchronized
		 */
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("1", "one");
		hm.put("2", "one");
		hm.put("1", "surely not one");
		hm.put("", "empty");
		hm.put(null, "null_1");
		hm.put(null, null);
		//hm.put(null, "null_2");
		hm.put("3", null);
		System.out.println("HashMap      : " + hm);

		/**
		 * 1)follow key insertion order
		 * 2)Allows null key and values
		 */
		LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
		lhm.put("1", "one_1");
		lhm.put("2", "two");
		lhm.put("1", "one_2");
		//lhm.put("3", "three");
		lhm.put("", "empty");
		lhm.put(null, null);
		lhm.put("4", null);
		System.out.println("LinkedHahMap : " + lhm);

		/**
		 * 1)Follows key descending order
		 * 2)Not allows null key and values, throws NullPointerException
		 * 3)Synchronized
		 */
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("1", "one_1");
		ht.put("3", "three");
		ht.put("1", "one_2");
		ht.put("0", "zero");
		ht.put("2", "two");
		ht.put("", "empty");
		//ht.put(null, null);
		//ht.put("4", null);
		System.out.println("Hahtable     : " + ht);

		/**
		 * 1)Follows key ascending order
		 * 2)Not allows null key, throws NullPointerException, but allows null values
		 */
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("1", "one_1");
		tm.put("3", "three");
		tm.put("1", "one_2");
		tm.put("0", "zero");
		tm.put("2", "two");
		tm.put("", "empty");
		//tm.put(null, null);
		tm.put("4", null);
		System.out.println("TreeMap      : " + tm);

	}

}
