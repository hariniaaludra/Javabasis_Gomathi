package com.inheritanceUdemyPractical;

public class DodgeChallenger extends Car {

	public DodgeChallenger(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		//reuse the perant constructor
		super(" Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);

	}
	 public void startTheEngine() {
	        System.out.println("A Dodge Challenger engine is started.");
	    }

}
class ToyotaSupra extends Car{

	public ToyotaSupra(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		//reuse the parent constructor
		super("ToyotaSupra", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
	}
	public void startTheEngine() {
        System.out.println("A ToyotaSupra engine is started.");
        
    }
	
}
