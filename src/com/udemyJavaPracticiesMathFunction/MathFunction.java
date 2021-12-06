package com.udemyJavaPracticiesMathFunction;

public class MathFunction {

	public static void main(String[] args) {

		double tempratureYesterday = 2.5;
		double tempratureToday = Math.random();
		System.out.println("Absolute temprature: " + Math.abs(tempratureToday));
		System.out.println("min: " + Math.min(tempratureToday,tempratureYesterday));
		System.out.println("max: " + Math.max(tempratureToday,tempratureYesterday));
		System.out.println("Round: " + Math.round(tempratureYesterday));
		System.out.println("Ceiling: " + Math.ceil(tempratureYesterday));
		System.out.println("Floor: " + Math.floor(tempratureYesterday));
		System.out.println("Power: " + Math.pow(tempratureYesterday,2));
		System.out.println("Square Root: " + Math.sqrt(tempratureYesterday));
		
	}

}
