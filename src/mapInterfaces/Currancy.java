package mapInterfaces;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Currancy{
 
public  void display(String countryName) throws Exception {
	 
		 HashMap<String,String> map1=new HashMap<String,String>();
		  map1.put("India", "INR");
		  map1.put("USA", "USD");
		  map1.put("Europe", "EUN");
		 for(Map.Entry m : map1.entrySet()) {
			 if(m.getKey().equals(countryName)) {
				 System.out.println(m.getValue());
			 }
			 else {
				 throw new Exception();
			 }
		 }
		 
	
	      
		 }
			 
		 
	public static void main(String[] args) throws Exception {
		
		Currancy obj1 = new Currancy();
		
		//System.out.println(obj1.display("India"));
		
		
	}
	}