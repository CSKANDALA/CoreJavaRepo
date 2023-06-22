package Collections;

import java.util.*;

/**
 * 1)Allows duplicates 2)Follows insertion order
 */

public class List {

	public static void main(String args[]) {

		/**
		 * 1)Not synchronized
		 */
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("B");
		arraylist.add("A");
		arraylist.add("C");
		arraylist.add("A");
		System.out.println("Array list : " + arraylist);
		System.out.println();

		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("B");
		linkedlist.add("A");
		linkedlist.add("C");
		linkedlist.add("A");
		System.out.println("Linked list : " + linkedlist);
		System.out.println();

		/**
		 * 1)Synchronized
		 */
		Vector<String> list = new Vector<String>();
		list.add("B");
		list.add("A");
		list.add("C");
		list.add("A");
		System.out.println("Vector list : " + list);
	}
}
