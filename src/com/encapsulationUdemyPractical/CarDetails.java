package com.encapsulationUdemyPractical;

public class CarDetails {

	public static void main(String[] args) {
		Car carDetails = new Car("BMW","red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
		System.out.println(carDetails.getDescription());

	}

}
