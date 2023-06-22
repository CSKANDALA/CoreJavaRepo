package hashcode;

import java.util.HashMap;
import java.util.Map;

public class MapExampleWithSameHashCode {

	public static void main(String[] args) {
		
		Map<Student, String> map=new HashMap<Student, String>();
		map.put(new Student(1), "one");
		map.put(new Student(2), "two");
		
		System.out.println("map size : "+map.size());
		System.out.println("map : "+map);
	}
}
