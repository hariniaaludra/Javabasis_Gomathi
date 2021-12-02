package com.udemyJavaPracticies;



public class AccessModifers {
	  private String name;
	    private String nickname;
	    private int yearOfBorn;
	    private String team;

	    private double freeThrowPercentage;
	    private double pointsPerGame;
	    private int gamesPlayed;

	    public AccessModifers(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
	        this.name = name;
	        this.nickname = nickname;
	        this.yearOfBorn = yearOfBorn;
	        this.team = team;
	        this.freeThrowPercentage = freeThrowPercentage;
	        this.pointsPerGame = pointsPerGame;
	        this.gamesPlayed = gamesPlayed;
	    }

	    public void freeThrow(){
	    	if((50>freeThrowPercentage) |( 100 < freeThrowPercentage)) {
	        	System.out.println(name + " minimum score free throw.");
	        }
	    else if(100 > freeThrowPercentage) {
	            System.out.println(name + " failed to score free throw.");
	        }  
	        else {
	            System.out.println(name + " scored free throw.");
	        }
	    }
}
