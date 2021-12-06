package com.udemyJavaPracticiesEnum;

public class Current {
public static void main(String[] args) {
	
      for (PowerLevel powerLevel : PowerLevel.values()) {
          System.out.println("- " + powerLevel.getVoltage());
      }
      System.out.println();
      Power power = new Power("AC", PowerLevel.MEDIUM,80);
      System.out.println("Name: " + power.getName());
      System.out.println("level: " +power.getPowerLevel().getVoltage());
      System.out.println("Unit: $" +power.getUnit());
      
}
}
