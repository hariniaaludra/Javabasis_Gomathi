package evaluationTask;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task20 {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
    if(!scan.hasNext()){
    	System.out.println("0");
    	return;
      } 
      // Write your code here.
    String s = scan.nextLine();
      scan.close();
      String[] tokens = s.trim().split("[ ! # @ $ % , ' * ?\\ ]");
     int size = tokens.length;
      System.out.println(size);
      for(int i =0; i<size; i++ ) {
    	  System.out.println(tokens[i]);
      }
      
}
}
