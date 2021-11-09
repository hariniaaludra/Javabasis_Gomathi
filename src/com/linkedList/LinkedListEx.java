package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {



	public static void main(String[] args) {
LinkedList<Integer> rollNo = new LinkedList<Integer>();
rollNo.add(101);
rollNo.add(102);
rollNo.add(103);
rollNo.add(104);
//adding the element in specific position
rollNo.addLast(102);
//remove element

//Add another list elements to the first list
LinkedList<Integer> rollNo1 = new LinkedList<Integer>();
rollNo.remove(0);
rollNo1.add(105);
rollNo1.add(106);
rollNo.addAll(rollNo1);
Iterator<Integer> itr = rollNo.descendingIterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
