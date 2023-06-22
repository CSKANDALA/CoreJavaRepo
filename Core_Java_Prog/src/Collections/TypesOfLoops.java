package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TypesOfLoops {

	public static void main(String[] args) {

		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(7);
		arrlist.add(39);
		arrlist.add(40);

		/* For Loop for iterating ArrayList */
		System.out.println("For Loop");
		for (int counter = 0; counter < arrlist.size(); counter++) {
			System.out.print(arrlist.get(counter)+" ");
		}
		System.out.println();
		
		/* Advanced For Loop */
		System.out.println("Advanced For Loop");
		for (Integer num : arrlist) {
			System.out.print(num+" ");
			// arrlist.remove(num); ===> throws Exception
		}
		System.out.println();
		
		/* While Loop for iterating ArrayList */
		System.out.println("While Loop");
		int count = 0;
		while (arrlist.size() > count) {
			System.out.print(arrlist.get(count)+" ");
			count++;
		}
		
		System.out.println();

		/* Looping Array List using Iterator */
		System.out.println("Iterator");
		Iterator iter = arrlist.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next()+" ");
			// arrlist.remove(iter); ====> valid here
		}

		System.out.println();
		
		/* Using Lamda expression */
		System.out.println("forEach");
		arrlist.forEach(values -> System.out.print(values+" "));
		
	}

}
