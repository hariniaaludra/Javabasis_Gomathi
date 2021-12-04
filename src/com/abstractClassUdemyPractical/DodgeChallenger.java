package com.abstractClassUdemyPractical;

public class DodgeChallenger extends Car {

	public DodgeChallenger(String name, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged, long registrationNumber) {
		super(name, color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged,
				registrationNumber);
		
	}

	
	public void startTheEngine() {
		System.out.println("A DodgeChallenger engine is started.");
		
	}


	

	
	

}
