package Collections;

import java.util.*;

/**
 * 1)Not allows duplicates 2)Order will depend on implementation
 */
public class Set {

	public static void main(String args[]) {
		/**
		 * 1)It will not follow any order 2)Allows null object 3)It uses equals() for
		 * finding the duplicate values(return true)
		 */
		HashSet<String> hs = new HashSet<String>();

		hs.add("B");
		hs.add("A");
		hs.add("C");
		hs.add("A");
		hs.add(null);
		System.out.println("HASH SET : " + hs);
		System.out.println();

		/**
		 * 1)It will follow insertion order 2)Allows null object
		 */

		LinkedHashSet<String> linkedhs = new LinkedHashSet<String>();
		linkedhs.add("B");
		linkedhs.add("A");
		linkedhs.add("C");
		linkedhs.add("A");
		linkedhs.add(null);
		System.out.println("LINKED HASH SET : " + linkedhs);
		System.out.println();

		/**
		 * 1)It will follow ascending order 2)Not allows null object 3)It uses
		 * compareTo() for finding the duplicate values(return 0)
		 */

		TreeSet<String> ts = new TreeSet<String>();
		ts.add("B");
		ts.add("A");
		ts.add("C");
		ts.add("A");
	   // ts.add(null);  //RunTimeException ->Exception in thread "main" java.lang.NullPointerException
		System.out.println("TREE SET 1 : " + ts);
		System.out.println();

		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(4);
		ts1.add(5);
		ts1.add(2);
		ts1.add(15);
		ts1.add(40);
		ts1.add(1);
		ts1.add(200);
		System.out.println("TREE SET 1 : " + ts1);

	}
}
