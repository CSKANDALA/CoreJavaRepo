package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class SortHashMapByValue {

	public static void main(String[] args) {

		HashMap<String, Integer> scores = new HashMap<String, Integer>();

		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);

		System.out.println(scores);
		
		ArrayList<Entry<String, Integer>> entryList=new ArrayList<Entry<String, Integer>>(scores.entrySet());
		entryList.sort((x,y)->x.getValue().compareTo(y.getValue()));
		
		System.out.println("--->"+entryList);
	}
}
