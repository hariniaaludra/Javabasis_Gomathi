package com.inheritance;


	class Animal{
		String Name = "pets";
		void display1() {
			System.out.println(Name);
		}
	}
	class Dog extends Animal{
		String DogName = "Tom";
		void display2() {
			System.out.println(DogName);
		}
	}
	class Cat extends Animal{
		String CatName = "Tiny";
		void display3() {
			System.out.println(CatName);
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

