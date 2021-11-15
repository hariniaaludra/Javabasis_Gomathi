package com.iterator;//package should be in com.iterator

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector<String>vec = new Vector<String>();
	vec.add("AAA");
	vec.add("BBB");
	vec.add("CCC");
	vec.add("DDD");
	Iterator <String>itr = vec.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	
}
}
