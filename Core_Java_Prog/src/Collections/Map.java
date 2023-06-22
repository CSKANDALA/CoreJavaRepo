package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class Map {
	
	public static void main(String args[]) {
	
		Hashtable<Integer,Integer> map1 = new Hashtable<Integer,Integer>();
		map1.put(4, 100);
		map1.put(3, 500);
		map1.put(5, 200);
		map1.put(6, 20);
		map1.put(1, 50);
		map1.put(1, 0);
	    System.out.println("Hashtable : "+map1);
	    System.out.println();
	    
	    HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
		map2.put(4, 100);
		map2.put(3, 500);
		map2.put(5, 200);
		map2.put(6, 20);
		map2.put(1, 50);
		map2.put(1,0);
	    System.out.println("HashMap   : "+map2); 
	    System.out.println();
	    
	    TreeMap<Integer,Integer> map3 = new TreeMap<Integer,Integer>();
	    map3.put(4, 100);
		map3.put(3, 500);
		map3.put(5, 200);
		map3.put(6, 20);
		map3.put(1, 50);
		map3.put(1,0);
	    System.out.println("Treemap   : "+map3); 
	   
	    TreeMap<String,String> map = new TreeMap<String,String>();
		map.put("B", "kesava");
		map.put("A", "sekhar");
		map.put("M", "chandra");
		map.put("Z", "aravind");
		map.put("D", "ashok");
	    System.out.println("Treemap   : "+map); 
		
	}

}
