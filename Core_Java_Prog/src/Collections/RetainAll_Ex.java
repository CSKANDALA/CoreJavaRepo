package Collections;

import java.util.ArrayList;

public class RetainAll_Ex {

	public static void main(String[] args) {
		/**
		 * retainAll== remove not matching values 
		 * 
		 */
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("1");
		list1.add("2");
		list1.add("4");
		list1.add("5");

		list2.add("1");
		list2.add("2");
		list2.add("3");
		list2.add("4");

		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2)->list1 : " + list1);
	}

}
