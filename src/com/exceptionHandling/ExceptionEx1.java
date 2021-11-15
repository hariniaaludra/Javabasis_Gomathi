package com.exceptionHandling;////package should be in com.exceptionhandling

public class ExceptionEx1 {

	public static void main(String[] args) {
		 try{  
		   
		      int data=100/0; 
		      System.out.println(data);
		   }catch(ArithmeticException e){System.out.println(e);
		   System.out.println("rest of the code...");  
		   }  
		 
		  
	}

}
