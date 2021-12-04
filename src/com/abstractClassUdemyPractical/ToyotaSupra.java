package com.abstractClassUdemyPractical;

public class ToyotaSupra extends Car {

	public ToyotaSupra(String name, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged, long registrationNumber) {
		super(name, color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged,
				registrationNumber);
		// TODO Auto-generated constructor stub
	}
	

	
	public void startTheEngine() {
		System.out.println("A ToyotaSupra engine is started.");
		
	}
	

}
