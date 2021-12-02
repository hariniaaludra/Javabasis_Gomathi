package com.inheritanceUdemyPractical2;

public class Sprinter extends Athlete {

	public Sprinter(String name, String nickname, int yearOfBorn, String team, int gamesPlayed, int points) {
		super("Gomathi", nickname, yearOfBorn, team, gamesPlayed, points);
		if(points> 50) {
			System.out.println("Gomathi is first place");
		}
	}
}
class LongRunner extends Sprinter {

	public LongRunner(String name, String nickname, int yearOfBorn, String team, int gamesPlayed,int points) {
		super("Myhtili", nickname, yearOfBorn, team, gamesPlayed,points);
		if(points>70) {
			System.out.println("Mythili is first place");
		}
	
	}
	
}
class Decathlon extends Sprinter{

	public Decathlon ( String nickname, int yearOfBorn, String team, int gamesPlayed,int points) {
		super("Diana", nickname, yearOfBorn, team, gamesPlayed,points);
if(points>=150) {
	System.out.println("diana is first place");
}
	}
	
}
class Heptathlon extends LongRunner{

	public Heptathlon ( String nickname, int yearOfBorn, String team, int gamesPlayed,int points) {
		super("Karthiga", nickname, yearOfBorn, team, gamesPlayed,points);
		if(points>=100) {
		System.out.println("Karthiga is first place");
		}
	}
}
