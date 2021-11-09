package mapInterfaces;

import java.util.HashMap;

public class Currancy {
 
static String display() {
	
	 
	  HashMap<String,String> map=new HashMap<String,String>();
	  map.put("India", "INR");
	  map.put("USA", "USD");
	  map.put("Europe", "EUN");
	  System.out.println(map.get("India"));
	  String s1 = "invalid";
	  return s1;
  } 
	public static void main(String[] args) {
		
		Currancy.display();
		
	}

}
