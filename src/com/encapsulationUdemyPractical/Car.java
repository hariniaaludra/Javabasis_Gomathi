package com.encapsulationUdemyPractical;

public class Car {
	String carName;
	String color;
	byte numberOfVehicleOwners;
	short power;
	short horsePower;
	short cubicCapacity;
	int price;
	int mileage;
	boolean isDamaged;

public Car(String carName, String color, byte numberOfVehicleOwners, short power, short horsePower,
		short cubicCapacity, int price, int mileage, boolean isDamaged) {
	super();
	this.carName = carName;
	this.color = color;
	this.numberOfVehicleOwners = numberOfVehicleOwners;
	this.power = power;
	this.horsePower = horsePower;
	this.cubicCapacity = cubicCapacity;
	this.price = price;
	this.mileage = mileage;
	this.isDamaged = isDamaged;
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public byte getNumberOfVehicleOwners() {
	return numberOfVehicleOwners;
}

public void setNumberOfVehicleOwners(byte numberOfVehicleOwners) {
	this.numberOfVehicleOwners = numberOfVehicleOwners;
}

public short getPower() {
	return power;
}

public void setPower(short power) {
	this.power = power;
}

public short getHorsePower() {
	return horsePower;
}

public void setHorsePower(short horsePower) {
	this.horsePower = horsePower;
}

public short getCubicCapacity() {
	return cubicCapacity;
}

public void setCubicCapacity(short cubicCapacity) {
	this.cubicCapacity = cubicCapacity;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getMileage() {
	return mileage;
}

public void setMileage(int mileage) {
	this.mileage = mileage;
}

public boolean isDamaged() {
	return isDamaged;
}

public void setDamaged(boolean isDamaged) {
	this.isDamaged = isDamaged;
}
public String getDescription() {

	return "Details :" + "\n" + "A " + color + " " + carName + " is created." + "\n" + "Price: €" + price + "\n"
			+ "Mileage: " + mileage + "km" + "\n" + "The car is damaged: " + isDamaged + "\n"
			+ "Cubic capacity: " + cubicCapacity + "\n"
			+ "Power: " + power + "kW(" + horsePower + "hp)" + "\n" + "CO2 emission: " +"\n"
			+ "Number of previous owners: " + numberOfVehicleOwners;
}
}