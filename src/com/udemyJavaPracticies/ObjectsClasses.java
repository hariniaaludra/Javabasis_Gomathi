package com.udemyJavaPracticies;

import java.util.Random;

public class ObjectsClasses {
	String name;
	String nickName;
	int yearOfBorn;
	String team;

	double runRate;
	double ponintPerGame;
	int gamePlayed;
public ObjectsClasses(String name, String nickName, int yearOfBorn, String team, double runRate,
		double ponintPerGame, int gamePlayed) {
	super();
	this.name = name;
	this.nickName = nickName;
	this.yearOfBorn = yearOfBorn;
	this.team = team;
	this.runRate = runRate;
	this.ponintPerGame = ponintPerGame;
	this.gamePlayed = gamePlayed;
}
public void runs() {

	if(100 < runRate) {
        System.out.println(name + " failed to score super overs.");
    } else {
        System.out.println(name + " more run scored.");
    }
}

}
