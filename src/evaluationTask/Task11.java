package evaluationTask;
import java.util.ArrayList;
import java.util.Scanner;

public class Task11 {
public static void main(String[] args) {
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	Scanner al = new Scanner (System.in);
	int addlist = al.nextInt();
	//int add[] = new int[addlist];
	 for(int i=0; i<addlist; i++) {
		 int n = al.nextInt();
		 ArrayList <Integer> newlist = new ArrayList<Integer>(); 
	 for(int j =0; j<n; j++) {
		 newlist.add(al.nextInt());
	 }
	 list.add(newlist);
	}
	 int a =al.nextInt();
	 for(int k=0; k<a; k++) {
		 int x = al.nextInt();
		 int y = al.nextInt();
		try {
			 System.out.println(list.get(x-1).get(y-1)); 
		 }catch(Exception e) {
			 System.out.println("Error");
		 }
		 }
	 
	}
}


