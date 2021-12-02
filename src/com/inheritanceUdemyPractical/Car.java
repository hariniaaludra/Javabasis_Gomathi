package com.inheritanceUdemyPractical;

import java.util.Random;

public class Car {
	private byte numberOfSeats = 5;
	private byte numberOfDoors = 3;
	private byte numberOfVehicleOwners = 1;
	private byte emissionSticker = 4;

	private short power = 362;
	private short horsePower = 492;
	private short co2Emission = 333;
	private short cubicCapacity = 6417;

	private int price = 29999;
	private int mileage = 14999;

	private long registrationNumber = 134098765L;

	private float fuelConsumptionCombined = 15.5F;
	private float fuelConsumptionUrban = 21.4F;
	private float fuelConsumptionExtraUrban = 13.6F;

	private double fuelConsumptionPreciseAverage = 153.2452345234525E-1;

	private boolean isDamaged = true;
	private char energyEfficiencyCategory = 'G';

	private String color;
	private String carName;

	public Car(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
			short cubicCapacity, int price, int mileage, boolean isDamaged) {
		this.carName = carName;
		this.color = color;
		this.numberOfVehicleOwners = numberOfVehicleOwners;
		this.power = power;
		this.horsePower = horsePower;
		this.cubicCapacity = cubicCapacity;
		this.price = price;
		this.mileage = mileage;
		this.isDamaged = isDamaged;
		Random randomNumberGenerator = new Random();
		this.registrationNumber = randomNumberGenerator.nextLong();
	}

	public void startTheEngine() {
		System.out.println("The engine is started.");
	}

	public String getDescription() {

		return "Details :" + "\n" + "A " + color + " " + carName + " is created." + "\n" + "Price: €" + price + "\n"
				+ "Mileage: " + mileage + "km" + "\n" + "The car is damaged: " + isDamaged + "\n"
				+ "Registration number: " + registrationNumber + "\n" + "Cubic capacity: " + cubicCapacity + "\n"
				+ "Power: " + power + "kW(" + horsePower + "hp)" + "\n" + "CO2 emission: " + co2Emission + "g/km" + "\n"
				+ "Emission sticker: " + emissionSticker + " ( Energy efficiency: " + energyEfficiencyCategory + ")"
				+ "\n" + "Combined fuel consumption: " + fuelConsumptionCombined + "l/100km" + "\n"
				+ "Urban fuel consumption: " + fuelConsumptionUrban + "l/100km" + "\n"
				+ "Extra urban fuel consumption: " + fuelConsumptionExtraUrban + "l/100km" + "\n"
				+ "Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km" + "\n"
				+ "Number of previous owners: " + numberOfVehicleOwners + "\n" + "Number of doors: " + numberOfDoors
				+ "\n" + "Number of seats: " + numberOfSeats;
	}
}
