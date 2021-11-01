package com.inheritance;

class PetAnimal { // calss name was in small letter
	String name = "pets";

	void display1() {
		System.out.println(name);
	}
}

class Puppy extends PetAnimal {
	String dogName = "Tom";

	void display2() {
		System.out.println(dogName);
	}
}

class Rat extends PetAnimal {
	String catName = "Tiny";

	void display3() {
		System.out.println(catName);
	}
}

public class Hierarchal {
	public static void main(String[] args) {
		Puppy obj1 = new Puppy();
		Rat obj2 = new Rat();
		obj1.display1();
		obj1.display2();
		obj2.display3();
	}
}
