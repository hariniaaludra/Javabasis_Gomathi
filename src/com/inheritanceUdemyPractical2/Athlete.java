package com.inheritanceUdemyPractical2;

public class Athlete {

    private String name;
    private String nickname;
    private int yearOfBorn;
    private String team;
    private int gamesPlayed;
    private int points;

    public Athlete(String name, String nickname, int yearOfBorn, String team, int gamesPlayed,int points) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        
    }

    public String getName() {
        return name;
    }

    public void getBio() {
        System.out.println(name + " (" + nickname + ")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and played " + gamesPlayed + " games");
        System.out.println("Points" + points);
    }

}
