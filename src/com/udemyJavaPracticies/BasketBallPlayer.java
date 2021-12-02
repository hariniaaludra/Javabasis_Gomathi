package com.udemyJavaPracticies;

public class BasketBallPlayer {

	public static void main(String[] args) {
		AccessModifers captain = new AccessModifers ("Kobe Bryant", "Black Mamba", 1978, "Lakers", 150.7, 25.0, 1346);
		AccessModifers teamMember = new AccessModifers ("Michael Jordan", "MJ", 1963, "Chicago Bulls", 85.5, 30.1, 1072);
		AccessModifers substitute= new AccessModifers ("Earvin Johnson", "Magic", 1959, "Lakers", 49.8, 19.5, 906);
		AccessModifers[] basketballPlayers = new AccessModifers[3];
	        basketballPlayers[0] = captain;
	        basketballPlayers[1] = teamMember;
	        basketballPlayers[2] = substitute;
	        for (AccessModifers basketballPlayer : basketballPlayers) {
	            basketballPlayer.freeThrow();
	        }

	}

}
