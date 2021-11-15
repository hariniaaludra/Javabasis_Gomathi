package com.stringhandling;//package should be in com.stringhandling

import java.util.Scanner;

public class ConcatinationEx1 {
	ConcatinationEx1(){
		Scanner input = new Scanner(System.in);
		String firstName = input.next();
		String lastName = input.next();
		if(firstName.length()<lastName.length()||firstName.length()>lastName.length()) {
			String result= "result: " + firstName.concat(lastName);
			System.out.println(result);
		}
		else {
			System.out.println("invalid name");
		}
		
	}
	public static void main(String[] args) {
		ConcatinationEx1 concatString = new ConcatinationEx1 ();
		concatString.getClass();
	}

}
