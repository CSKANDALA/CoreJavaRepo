package pre.testing;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {

		Map<Long, String> map = new TreeMap<Long, String>();
		
		map.put(System.currentTimeMillis()-1000, "kesava01");
		map.put(System.currentTimeMillis(), "kesava02");
		map.put(System.currentTimeMillis()-2000, "kesava03");
		System.out.println("--->"+map);
	}
}
