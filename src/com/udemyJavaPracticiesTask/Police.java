package com.udemyJavaPracticiesTask;

import java.util.Random;

public class Police {
	private Detective adamPalmer;
	Police() {
        Items[] adamItems = new Items[2];
        adamItems[0] = new Items("Revolver", 500.0);
        adamItems[1] = new Items("Magnifying glass", 10.0);
        adamPalmer = new Detective("Adam Palmer", "Coyote", 1960, "chess", adamItems);
    }
	public boolean catchCriminals(Gang gang) {
        if (areCriminalsCaught()) {
            System.out.println(adamPalmer.getName() + " managed to catch the gang");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered.");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang couldn't steal anything.");
            }
            return true;
        } else {
            System.out.println(adamPalmer.getName() + " couldn't catch the criminals.");
            System.out.println("They managed to steal items valued $" + gang.getSumRobbedValue());
            return false;
        }
    }
	private boolean areCriminalsCaught() {
		 Random randomNumberGenerator = new Random();
	        if (randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE) {
	            return false;
	}
	        return false;
}
}