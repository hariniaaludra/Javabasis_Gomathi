package com.udemyJavaPracticiesTask;

public class TheGreatRobbery {
public static void main(String[] args) {
	 City city = new City();
     Gang theGang = new Gang();
     Police police = new Police();
     theGang.printGangInfo();
    do {
         theGang.letsRob(city.getBuildings());
     } while (!police.catchCriminals(theGang));
 }
}

