package pre.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortValues {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<String>();
		obj.add("WARNING");
		obj.add("MESSAGE");
		obj.add("ERROR");
		System.out.println("---->" + obj);
		Collections.sort(obj);
		System.out.println("--->" + obj.get(0) + " : " + obj.get(2) + ": " + obj.get(1));

	}
}
