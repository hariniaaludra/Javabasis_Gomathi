package com.abstractClassUdemyPractical;

public class CarsApp {

	public static void main(String[] args) {
		 Car redDodgeChallenger = new DodgeChallenger("DodgeChallenger","red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true, (long)74825188450787676L );
		 redDodgeChallenger.getDescription();
		 redDodgeChallenger.startTheEngine();
		 Car toyotaSupra = new ToyotaSupra("ToyotaSupra","black", (byte)2, (short)550, (short)787, (short)7900, 50000, 16000, true, (long)58686398450787676L );
		 toyotaSupra.getDescription();
		 toyotaSupra.startTheEngine();
	}
	

}
