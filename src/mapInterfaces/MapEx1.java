package mapInterfaces;//package should be in com.mapinterfaces

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(100,"Amit");  
	  map.put(101,"Vijay");  
	  map.put(102,"Rahul");
	  map.entrySet()
	  .stream() 
	  .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) 
	  .forEach(System.out::println);  
	  for(Map.Entry m:map.entrySet()) {
	  System.out.println(m.getKey() + " "+m.getValue());
	  }
	}

}
