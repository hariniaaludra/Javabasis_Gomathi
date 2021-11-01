package com.inheritance;
class A{//not in proper name
	static void display() {                  //declear static for method
		System.out.println("A");
	}
}
class B extends A{
	static void display1() {                //declear static for method
		System.out.println("B");
	}
}
class C extends B{                    //declear static for method
	static void display2() {
		System.out.println("C");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		//C obj = new C();             // don't want to create object if we declear static for method
		C.display();
		C.display1();               // eg.C.method name();
		C.display2();
		
	}

}
