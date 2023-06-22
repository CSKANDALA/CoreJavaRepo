package pre.testing;

import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo{  
	 public static void main(String args[]){ 
		 LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();  
	  
	  hm.put("FREQUENCY","Amit");  
	  hm.put("VOLTAGE","Ravi");  
	  hm.put("POWER_FACTOR","Vijay");  
	  hm.put("CURRENT","Rahul");  

	 
      for(Map.Entry m:hm.entrySet()){  
    	   System.out.println(m.getKey()+" "+m.getValue());  
    	  }  
	 }  
	}  
