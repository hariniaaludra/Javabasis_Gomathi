package com.inheritance;
class A{
	void display() {
		System.out.println("A");
	}
}
class B extends A{
	void display1() {
		System.out.println("B");
	}
}
class C extends B{
	void display2() {
		System.out.println("C");
	}
}

public class Multilevel {
	public static void main(String[] args) {
		C obj = new C();
		obj.display();
		obj.display1();
		obj.display2();
		
	}

}
