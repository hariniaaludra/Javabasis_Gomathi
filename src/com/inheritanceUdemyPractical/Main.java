package com.inheritanceUdemyPractical;

public class Main {

	public static void main(String[] args) {
		 DodgeChallenger redDodgeChallenger = new DodgeChallenger(" Dodge Challenger","red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
	        System.out.println(redDodgeChallenger.getDescription());
	        redDodgeChallenger.startTheEngine();
	        System.out.println();
	        ToyotaSupra blackToyotaSupra = new ToyotaSupra("ToyotaSupra","black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
	        System.out.println(blackToyotaSupra.getDescription());
	        blackToyotaSupra.startTheEngine();

	}

}
