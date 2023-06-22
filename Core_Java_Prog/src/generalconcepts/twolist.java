package generalconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class twolist {
	public static void main(String[] args) {
		
	ArrayList<Integer> a1 = new ArrayList<Integer>();
		/*a1.add(1);
		a1.add(3);
		a1.add(10);
		a1.add(20);
		a1.add(35);
		a1.add(40);*/
		
	a1.addAll(Arrays.asList(1, 3, 10, 20, 35,40));
		
	ArrayList<Integer> a2 = new ArrayList<Integer>();
		/*a2.add(2);
		a2.add(5);
		a2.add(15);
		a2.add(25);
		a2.add(30);
		a2.add(40);*/
		
        a2.addAll(Arrays.asList(2, 5, 15, 25, 30,45));
       
	   ArrayList<Integer> newList = new ArrayList<Integer>();
		
		newList.addAll(a1);
		newList.addAll(a2);
	     Collections.sort(newList);

	     List<Integer> list = newList.subList(0, 10);
	     System.out.println("Smallest 10 integers from these two lists: "+list);
	     
		

	}
}
