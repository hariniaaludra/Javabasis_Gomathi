package com.udemyJavaPracticies;

public class MethodPractice {
	public static void energyEfficiencyCategory (char category) {
		if(category== 'A') {
			System.out.println("Energy consumption level is very low");
		}
		else if(category== 'B') {
			System.out.println("Energy consumption level is  low");
		}
		else if(category== 'C') {
			System.out.println("Energy consumption level is normal");
		}
		else if(category== 'D') {
			System.out.println("Energy consumption level is above normal");
		}
		else if(category== 'E') {
			System.out.println("Energy consumption level is high");
		}
		else if(category== 'F') {
			System.out.println("Energy consumption level is very high");
		}
		
	}
	public static void main(String[] args)
	{
		MethodPractice.energyEfficiencyCategory('B');
	}
}
