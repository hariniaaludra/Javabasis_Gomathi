package com.udemyJavaPracticiesTask;

import java.util.Random;

public class Gang {
	  private Criminal[] criminals = new Criminal[2];
	    private Random randomNumberGenerator = new Random();
	    private double sumRobbedValue;
	   public Gang() {
	        Items[] robItems = new Items[2];
	        robItems[0] = new Items("Blunt Swiss knife", 10.5);
	        robItems[1] = new Items("Half rotten apple", 0.0);
	        Criminal rob = new Criminal("Rob", "The head", 1976, "breaking in", robItems);
	        criminals[0] = rob;
	        Items[] bobbyItems = new Items[2];
	        bobbyItems[0] = new Items("Baseball bat", 20.0);
	        bobbyItems[1] = new Items("Toothpick", 0.5);
	        Criminal bobby = new Criminal("Bobby", "The mountain", 1978, "knocking out", bobbyItems);
	        criminals[1] = bobby;
	    }
	   public double getSumRobbedValue() {
	        return sumRobbedValue;
	    }
	   public void printGangInfo() {
	        for (Criminal criminal : criminals) { 
	            criminal.bioData();
	        }
	    }
	   private boolean isSuccessfulRobbery() {
	        int randomNumber = randomNumberGenerator.nextInt(101);
	        int summarizedSuccessChange = criminals.length * Criminal.SUCCESS_PERCENTAGE;
	        if (randomNumber >= summarizedSuccessChange) {
	            return false;
	        }
	        return true;
	    }
	   public void letsRob(Building[] buildings) {
	        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length+1);
	        
	        if (isSuccessfulRobbery()) {
	            System.out.println("The gang managed to rob the following items from the " + buildings[randomBuildingIndex].getName() + ":");
	            for (Items items : buildings[randomBuildingIndex].getItems()) {
	                sumRobbedValue += items.getValue();
	                System.out.println("-" + items.getName());
	            }
	        } else {
	            System.out.println("The gang tried to rob the " + buildings[randomBuildingIndex].getName() + " but they failed.");
	        }

	    }

}
