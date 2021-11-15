package com.polymorphism;//package should be in com.polymorphism

 class College{
	
	public void details(String name,int id, String University) {//method should be in small letter
		
		System.out.println("College details: "+ name + id + University );
		}
	
}
 class FstStudent extends College{
	 public void details(String name,int id, String Department) {
		 	 
		 System.out.println("student details: "+ name + id + Department);
	 }
 }
 class SecStudent extends College{
	 public void details(String name,int id, String Department) {
		 
		 System.out.println("student details: "+ name + id + Department );
	 }
 }
public class Polymorphism1 {
public static void main(String[] args) {
	College obj = new College();
	//FstStudent obj1 = new FstStudent();
	//SecStudent obj2 = new SecStudent();
	obj.details("CMS",7204, "Anna University");
	obj.details("Abi",720401, "CSE");
	obj.details("Angel",720402, "ECE");
	
}
}
