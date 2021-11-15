package com.polymorphism;//package should be in com.polymorphism


class Employee {
	void employee(int a, int b) {//method should be in small letter
		System.out.println("Name: " + a + "\n id: " + b);
	}
}

class Emply1 extends Employee {
	void Employee(int a, int b) {
		System.out.println("Name: " + a + "\n id: " + b);
	}
}

public class OverRiding {

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.Employee(2, 6);
		obj.Employee(2, 6);
	}

}
/*
 * class Employee{ static void Employee(String name, int id) {
 * System.out.println("Name: "+ name + "\n id: "+ id); } } class Emply1 extends
 * Employee { static void Employee(String name, int id) {
 * System.out.println("Name: "+ name + "\n id: "+ id); } }
 */
