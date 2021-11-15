package com.inheritance;
class A{//class name should be in proper
	void display() {
		System.out.println("A");
	}
}
class B extends A{//class name should be in proper
	void display1() {
		System.out.println("B");
	}
}
class C extends B{//class name should be in proper
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
