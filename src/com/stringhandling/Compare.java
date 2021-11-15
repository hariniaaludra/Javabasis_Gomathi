package com.stringhandling;//package should be in com.stringhandling
//syntax: public int compareTo(String anotherString)
public class Compare {
	public static String comparestr(String firstName, String secondName ) {
		 
		
	
		 String result = "result= "+ (firstName.compareTo(secondName));
			return result ;
		
		
	}
public static void main(String[] args) {
	Compare  stirngobject = new Compare();//should be in small letter
	System.out.println(Compare.comparestr("abi","Nandhu"));
	
	
	
}
}
