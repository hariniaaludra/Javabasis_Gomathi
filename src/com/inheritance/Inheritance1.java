package com.inheritance;

class Animal {
	String name = "pets";

	void display1() {
		System.out.println(name);
	}
}

class Dog extends Animal {
	String dogName = "Tom";

	void display2() {
		System.out.println(dogName);
	}
}

class Cat extends Animal {
	String catName = "Tiny";

	void display3() {
		System.out.println(catName);
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Dog obj1 = new Dog();
		Cat obj2 = new Cat();
		obj1.display1();
		obj1.display2();
		obj2.display3();
	}
}
