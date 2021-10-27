package com.inheritance;
//single inheritance
class Univercity{  
void Name(){
	System.out.println("Anna University");
	}  
}  
class CMS extends Univercity{  
void ClgName()
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
