package com.inheritance;
class A_Student{//not in proper name
	static void display() {                  //declear static for method
		System.out.println("A");
	}
}
class B_Student extends A_Student{
	static void display1() {                //declear static for method
		System.out.println("B");
	}
}

class C_Student extends B_Student { // declear static for method
	static void display2() {
		System.out.println("C");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		//C obj = new C();             // don't want to create object if we declear static for method
		C_Student.display();
		C_Student.display1();               // eg.C.method name();
		C_Student.display2();
		
	}

}
