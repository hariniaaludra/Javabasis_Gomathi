package com.inheritance;
class A{//not in proper name
	 void display() {                  //declear static for method
		System.out.println("A");
	}
}
class B extends A{
	 void display1() {                //declear static for method
		System.out.println("B");
	}
}
class C extends B{                    //declear static for method
	 void display2() {
		System.out.println("C");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		C obj = new C();             // don't want to create object if we declear static for method
		obj.display();
		obj.display1();               // eg.C.method name();
		obj.display2();
		
	}

}
