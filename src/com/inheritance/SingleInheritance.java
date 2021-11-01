package com.inheritance;

class Univercity {
	void name() {// method name was in small letter
		System.out.println("Anna University");
	}
}

class CMS extends Univercity {
	void clgName() // declear static for method
	{
		System.out.println("CMS");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		CMS d = new CMS();
		d.name();
		d.clgName();

	}
}
