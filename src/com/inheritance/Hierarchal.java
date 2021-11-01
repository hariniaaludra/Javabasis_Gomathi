package com.inheritance;
class PetAnimal{ //calss name was in small letter
	String Name = "pets";
	void display1() {
		System.out.println(Name);
	}
}
class Puppy extends PetAnimal{
	String DogName = "Tom";
	void display2() {
		System.out.println(DogName);
	}
}
class Rat extends PetAnimal{
	String CatName = "Tiny";
	void display3() {
		System.out.println(CatName);
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
