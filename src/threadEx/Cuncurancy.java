package threadEx;//package should be in com.threadex

import java.util.Scanner;

public class Cuncurancy implements Runnable {
	public void run() {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for(int i = 0; i<20; i++) {
			System.out.println(number + " x " + (i+1) + " = " + (number*(i+1)));
		}
	}

	public static void main(String[] args) {
		Cuncurancy table = new Cuncurancy();
		Thread thread = new Thread(table);
		thread.start();
		while(thread.isAlive()) {
		
			
			
		}
		
		
	}

}
