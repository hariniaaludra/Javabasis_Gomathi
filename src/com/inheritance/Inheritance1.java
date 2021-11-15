package com.inheritance;


	class Animal{
		String name = "pets";//should be in small letter
		void display1() {
			System.out.println(name);
		}
	}
	class Dog extends Animal{
		String dogname = "Tom";//should be in small letter
		void display2() {
			System.out.println(dogname);
		}
	}
	class Cat extends Animal{
		String catname = "Tiny";//should be in small letter
		void display3() {
			System.out.println(catname);
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

