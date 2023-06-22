package pre.testing;

import java.util.*;
import java.util.Map.Entry;

public class HashMapRecordRemove {

	public static void main(String args[]){  
		  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"Amit");  
		  hm.put(101,"Vijay");  
		  hm.put(102,"Rahul");  
		 
	 // it returns exception : Exception in thread "main" java.util.ConcurrentModificationException 
		 /* for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			  System.out.println("===>"+hm.values()+" checker : "+hm.isEmpty());
			  hm.remove(entry.getKey());
		  }*/
		  
		//it will not return any exception  
		  for(Iterator<Map.Entry<Integer, String>> it = hm.entrySet().iterator(); it.hasNext(); ) {
	      Map.Entry<Integer, String> entry = it.next();
	      System.out.println("===>"+hm.values()+" checker : "+hm.isEmpty());
	        it.remove();
	    }
		   System.out.println("--->"+hm.values() +" checker : "+hm.isEmpty());
		   }  
}
