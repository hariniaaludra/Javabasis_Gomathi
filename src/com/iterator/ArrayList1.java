package com.iterator;//package should be in com.iterator

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	public void display() {
		ArrayList<String>list= new ArrayList<String>();
		list.add("Sunday");
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednessday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Saturday");
		String element = list.get(1);
        System.out.println( element);
	}
	public static void main(String[] args) {
		
			}

	

}
