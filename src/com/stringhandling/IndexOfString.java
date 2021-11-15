package com.stringhandling;//package should be in com.stringhandling

public class IndexOfString {
public static void main(String[] args) {
	String name = "String Handiling";
	 int count = 0;
	System.out.println(name.charAt(5));
	System.out.println(name.length()-1);
	for(int i =0; i<=name.length()-1; i++) {
		if((i%2!=0)&&(name.charAt(i)=='i')) {//odd String and frequency
			System.out.println("To print odd String Only:\n"+ i + " place " + name.charAt(i));
			count++;
		}
		
		
	}
	System.out.println(count);
}
}
