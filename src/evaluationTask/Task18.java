package evaluationTask;//package should be in com.evaluationtask
import java.util.Scanner;

public class Task18 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int t=sc.nextInt();

     for(int i=0;i<t;i++)
     {

         try
         {
             long x=sc.nextLong();
             System.out.println(x+" can be fitted in:");
             if(x>=-128 && x<=127){System.out.println("* byte");}
              if(x>=-32768 && x<=32767){System.out.println("* short" + "\n" + "* int" + "\n"+ "* long");}
            if(x>=(-2^31)&& x<=((2^31) -1)){System.out.println("* int" + "\n"+ "* long");}
            if(x>=(-2^63) && x<=((-2^63)-1)){System.out.println("* long" + "\n"+ "* long");}
            
             //Complete the code
         }
         catch(Exception e)
         {
             System.out.println(sc.next()+" can't be fitted anywhere.");
         }

     }
}
}
