package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
public static void main(String[] args) {
	LinkedList<String>llist = new LinkedList<String>();
	llist.add("abi");
	llist.add("angel");
	llist.add("nandhu");
	llist.add("shalu");
	Iterator <String> itr = llist.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
	
}
}
