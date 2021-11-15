package com.inheritance;
//single inheritance
class Univercity{  
void name(){//method should be in small letter
	System.out.println("Anna University");
	}  
}  
class CMS extends Univercity{  
void clgName()//method name should be in small letter
{
	System.out.println("CMS");
	}  
}
public class SingleInheritance {
	
	
public static void main(String[] args) {
	CMS d=new CMS();  
	d.name();  
	d.clgName();  
			
	
}
}
