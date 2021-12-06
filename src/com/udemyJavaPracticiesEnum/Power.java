package com.udemyJavaPracticiesEnum;

public class Power {
String name;
PowerLevel powerLevel;
Double unit;
public Power(String name, PowerLevel powerLevel, double unit) {
	
	this.name = name;
	this.powerLevel = powerLevel;
	this.unit = unit;
}
public  double totalUnit() {
	if(unit<50) {
	System.out.println(unit+"-Low voltage");
	return 45.5;
	}	
	else if(unit>50 && unit<80) {
		System.out.println(unit+"-Medium voltage");
		return 70.5;
		}
	else if(unit>100|| unit > 80) {
		System.out.println(unit+"-High Voltage");
		}
	return unit;
}
public String getName() {
	return name;
}

public PowerLevel getPowerLevel() {
	return powerLevel;
}

public Double getUnit() {
	return unit;
}


}
