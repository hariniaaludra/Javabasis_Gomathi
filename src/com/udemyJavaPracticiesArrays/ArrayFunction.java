package com.udemyJavaPracticiesArrays;

import java.util.Arrays;

public class ArrayFunction {

	public static void main(String[] args) {
		int a[] = new int[10];
		System.out.println(Arrays.toString(a));
		
		System.out.println("the points are start from 100");
		Arrays.fill(a, 100);
		System.out.println(Arrays.toString(a));
		
		System.out.println("the points are start from 100");
		Arrays.fill(a, 0, 5, 50);;
		System.out.println(Arrays.toString(a));
		
		System.out.println("the 5th point increase +150");
		a[5] += 150;
		System.out.println(Arrays.toString(a));
		
		System.out.println("the  points in order");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println("Last five points");
		int[] lastsFivePoints = Arrays.copyOf(a, 5);
		System.out.println(Arrays.toString(lastsFivePoints));
		
		System.out.println("top five points");
		int[] topFivePoints = Arrays.copyOfRange(a, a.length-5,a.length);
		System.out.println(Arrays.toString(topFivePoints));
		 
		if(Arrays.equals(lastsFivePoints, topFivePoints)) {
			System.out.println("Points are equal ");
		}
		else {
			System.out.println("Points are not Equal");
		}
		
		Arrays.sort(a);
		if(Arrays.binarySearch(a,300)>=0) {
			System.out.println("Someone changed point , the game is over");
		}
		else {
			System.out.println("points are not reached 200 ");
		}
	}

}
