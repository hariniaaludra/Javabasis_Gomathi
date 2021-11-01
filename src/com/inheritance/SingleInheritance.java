package com.inheritance;
//single inheritance
class Univercity{  
 void Name(){// method name was in small letter 
	System.out.println("Anna University");
	}  
}  
class CMS extends Univercity{  
 void ClgName()                            //declear static for method
{
	System.out.println("CMS");
	}  
}
public class SingleInheritance {
	
	
public static void main(String[] args) {
	CMS d=new CMS();  
	d.Name();  
	d.ClgName(); 
	
}
}
