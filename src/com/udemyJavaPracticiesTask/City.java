package com.udemyJavaPracticiesTask;

public class City {
	private Building[] building = new Building[3];
	public City() {
		Items[] firstItems = new Items[2];
		firstItems[0] = new Items("Letter opener", 1.5);
		firstItems[1] = new Items("Stamp", 2.5);
		building[0] = new Building("Bank", firstItems);
		
		Items[] secondItems = new Items[2];
		secondItems[0] = new Items("Pair of fancy shoes", 1.5);
		secondItems[1] = new Items("Broken glass", 2.5);
		building[1] = new Building("Mansion", secondItems);
		
		Items[] theirdItems = new Items[2];
		theirdItems[0] = new Items("Letter to Jenny", 1.5);
		theirdItems[1] = new Items("Pencil", 2.5);
		building[2] = new Building("Post Office", theirdItems);
	}
	public Building[] getBuildings() {
        return building;
    }
}
