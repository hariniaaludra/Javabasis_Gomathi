package com.udemyJavaPracticiesEnum;

public enum PowerLevel {
LOW("low"), MEDIUM("medium"),HIGH("high");
	String voltage;
	PowerLevel(String voltage){
		this.voltage= voltage;
	}
	public String getVoltage() {
		
		return voltage;
		
	}
	
	
}
