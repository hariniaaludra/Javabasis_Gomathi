package com.iterator;//package should be in com.iterator

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
public static void main(String[] args) {
	Stack<String> stc = new Stack<String>();
	stc.add("111");
	stc.add("222");
	stc.add("333");
	stc.add("444");
	Iterator<String> itr = stc.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
