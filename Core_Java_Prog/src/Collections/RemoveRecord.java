package Collections;

import java.util.ArrayList;

public class RemoveRecord {
	public static void main(String[] args) {
		ArrayList<String> objArray = new ArrayList<String>();
		objArray.add(0, "0");
		objArray.add(1, "1");
		objArray.add(2, "2");
		objArray.add(3, "3");
		System.out.println("Array before removing an element" + objArray);
		objArray.remove(0);
		System.out.println("--->" + objArray);
		objArray.remove("1");
		System.out.println("===>" + objArray);
		objArray.clear();
		System.out.println("Array after removing an element" + objArray);
	}

}
