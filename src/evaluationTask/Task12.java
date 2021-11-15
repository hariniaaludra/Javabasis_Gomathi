package evaluationTask;//package should be in com.evaluationtask
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task12 {
public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	int N = input.nextInt();
	LinkedList <Integer> list1 = new LinkedList<Integer>();
	for(int i=0; i<N; i++) {
		int n = input.nextInt();
	list1.add(n);
	}
	int m = input.nextInt();
	for(int i =0; i<m; i++) {
		
		String s = input.next();
			
		if(s .equals("insert")) {
			int index = input.nextInt();
			int value = input.nextInt();
	     list1.add(index,value);
		}
		else {
			int index = input.nextInt();
	      list1.remove(index);
		}
	}
	
	for(Integer num : list1)  {
	 
		System.out.println(num + "");
	
		System.out.println("\n");
	}
	
	
}
}
