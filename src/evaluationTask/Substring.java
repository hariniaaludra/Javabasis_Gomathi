package evaluationTask;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Substring {

	public static void main(String[] args) {
		Scanner substr = new Scanner(System.in);
		String str = substr.next();
		int n = substr.nextInt();
		SortedSet<String>sets = new TreeSet<String>();
		for(int i =0; i<=str.length()-n; i++) {
			sets.add(str.substring(i,i+n));
		}
System.out.println(sets.first());
System.out.println(sets.last());
	
	}

}
