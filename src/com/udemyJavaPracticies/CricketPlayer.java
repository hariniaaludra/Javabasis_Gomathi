package com.udemyJavaPracticies;

public class CricketPlayer {

	public static void main(String[] args) {
		ObjectsClasses FirstcricketPlayer = new ObjectsClasses("Manoj S Nair", "MSN", 1999, "Black Memba", +80.5, 95, 80);
		ObjectsClasses SecondcricketPlayer = new ObjectsClasses("Dinesh", "dinesh", 1995, "Black Memba", +85.5, 98, 90);
		ObjectsClasses TheridcricketPlayer = new ObjectsClasses("Karthik", "karthik", 1996, "Black Memba", +90.2, 92, 100);
		ObjectsClasses[] objectClass = new ObjectsClasses[3];
		objectClass[0] = FirstcricketPlayer;
		objectClass[1] = SecondcricketPlayer;
		objectClass[2] = TheridcricketPlayer;
		for(ObjectsClasses cricketPlayers :objectClass ) {
			cricketPlayers.overs();
		}
	}

}
