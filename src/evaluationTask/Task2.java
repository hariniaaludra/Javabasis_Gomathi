package evaluationTask;
import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int t=in.nextInt();
    for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int ans = a;
        for(int j =0 ; j<n; j++){ 
    int sum =(int) (Math.pow(2,j)*b);
        	//int sum =((2^j)*b);
     ans = ans + sum;
     System.out.printf("%s ",ans);
        }
        if (i<t-1) {
        	System.out.print("\n");
        }
    }
   
}
}
