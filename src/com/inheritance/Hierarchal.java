package com.inheritance;
class PetAnimal{//class should be in PetAnimal
	String name = "pets";
	void display1() {
		System.out.println(name);
	}
}
class Puppy extends PetAnimal{
	String dogname = "Tom";
	void display2() {
		System.out.println(dogname);
	}
}
class Rat extends PetAnimal{
	String catname = "Tiny";
	void display3() {
		System.out.println(catname);
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
