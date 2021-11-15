package com.arraysList;//package should be in com.arrayslist

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
	public static void main(String[] args)
	{
		ArrayList<String>fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		//sort
		Collections.sort(fruits);
		//get set method
		System.out.println(fruits.get(1));
		fruits.set(2, "Pomogranet");
		//for each loop
		for(String fruitsName : fruits) {
			System.out.println(fruitsName);
		}
		//using iterator
		Iterator<String> list = fruits.iterator();
		while(list.hasNext()) {
			System.out.println(list.next());
			
		}
		//iterator in reverse order
		ListIterator<String> list1 = fruits.listIterator(fruits.size());
		while(list1.hasPrevious()) {
			String fname =list1.previous();
			System.out.println(fname);
		}
		//for loop
		for(int i = 0; i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
	}
}
