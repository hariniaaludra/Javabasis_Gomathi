package evaluationTask;//package should be in com.evaluationtask
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
      //  String firstString="";
        // String reverse = "";
       // int length = firstString.length();
        
        String reverse = new StringBuilder(A).reverse().toString();
            
        
        if(A.equals(reverse)){
        //	String ans = (firstString==reverse)?"yes":"no";
           System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }
	}

}
