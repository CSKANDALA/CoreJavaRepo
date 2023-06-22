package Collections;

import java.util.ArrayList;

public class Contains_Ex {

	public static void main(String[] args) {

		ArrayList<String> objArray = new ArrayList<String>();
		ArrayList<String> objArray2 = new ArrayList<String>();
		
		objArray2.add("common1");
		objArray2.add("common2");
		objArray2.add("notcommon");
		objArray2.add("notcommon1");
		objArray.add("common1");
		objArray.add("notcommon1");
		System.out.println("Array elements of array1" + objArray);
		System.out.println("Array elements of array2" + objArray2);
		System.out.println("Array 1 contains String common2?? " + objArray.contains("common1"));
		System.out.println("Array 2 contains Array1?? " + objArray2.contains(objArray));
	}
}
