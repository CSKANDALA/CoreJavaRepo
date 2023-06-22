package Collections;

import java.util.ArrayList;

public class RemovingArrayList {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();

		list1.add("0");
		list1.add("1");
		list1.add("2");

		list2.add("0");
		list2.add("1");
		list2.add("3");
		list2.add("4");

		System.out.println("list 1 : " + list1);
		System.out.println("list 2 : " + list2);
		list1.removeAll(list2);
		System.out.println("list1.removeAll(list2)-->list1 :  " + list1);
		
	}

}
