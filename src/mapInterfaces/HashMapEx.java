package mapInterfaces;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		 HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   System.out.println(map.get(1)); 
		   for(Integer fruits:map.keySet()) {
			   System.out.println(fruits);
		   }
		   System.out.println("Iterating Hashmap...");  
		   for(Entry<Integer, String> m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());  
		   }
	}

}
