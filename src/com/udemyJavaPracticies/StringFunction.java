package com.udemyJavaPracticies;

import java.util.Scanner;

public class StringFunction {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        String countryName = input.nextLine();

	        if (countryName.equals("India")) {
	            System.out.println("India was typed in.");
	        } else {
	            System.out.println("The text typed in is: " + countryName);
	        }
	        
	        System.out.println("The input text contains ab."+countryName.contains("ab") );

	        if (!countryName.contains("ab")) {
	            System.out.println("The input text contains ab.");
	        }

	        if (countryName.isEmpty()) {
	            System.out.println("The input text is empty.");
	        }

	        System.out.println("The input text's length is: " + countryName.length());
	        System.out.println("The input text with uppercase: " + countryName.toUpperCase());
	        System.out.println("The input text with lowercase: " + countryName.toLowerCase());

	        if (countryName.startsWith("I") || countryName.endsWith("I")) {
	            System.out.println("The input text starts or ends with a I letter.");
	        }

	        

	}

}
