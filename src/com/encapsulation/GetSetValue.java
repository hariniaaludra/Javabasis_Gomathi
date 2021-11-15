package com.encapsulation;//package should be in com.encapsulation
 class Name{
private String myname;//should be in small letter
//public String setName;
public String getName() {
	return myname;
}
public void setName(String name){
	this.myname = name;	
}
}
public class GetSetValue {
public static void main(String[] args) {
	Name obj = new Name();
	obj.setName ("gomathi");
	System.out.println(obj.getName());
	
}
}
 