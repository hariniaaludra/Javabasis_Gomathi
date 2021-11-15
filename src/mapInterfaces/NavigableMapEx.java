package mapInterfaces;//package should be in com.mapinterfaces

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapEx {

	public static void main(String[] args) {
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Amit");    
	      map.put(102,"Ravi");    
	      map.put(101,"Vijay");    
	      map.put(103,"Rahul"); 
	      map.put(104,"Abi"); 
	      map.put(105,"Shalini"); 
	      System.out.printf("Floor Entry  : %s%n",
                  map.floorKey(105));
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map.descendingMap());  
	      // less than or equal to the specified key.  
	      System.out.println("headMap: "+map.headMap(102,true));  
	      // greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(102,true));  
	      // exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(100, false, 102, false));   
	}

}
