package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//iterator methods:
//hasNext()
//next()
//remove()
//forEachRemaining()
public class IteratorEx1 {
	public static void editerate2(Collection<Integer> list3)
	{
	    Iterator<Integer> it=list3.iterator();
	    while(it.hasNext())
	    {
	        if(it.next()==2 || it.next()==3 || it.next() ==5 || it.next()==7 ) 
	        {
	            it.remove();
	        }
	    }
	    System.out.println("List 3:");
	    System.out.println("After removing prime numbers  : " + list3);
	}	
public static void main(String[] args) {
	IteratorEx1 obj = new IteratorEx1();

	
}
}