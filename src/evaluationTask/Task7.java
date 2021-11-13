package evaluationTask;
import java.util.Scanner;

class MyCalculator1 {

	public int power(int n, int p) throws Exception{

		
			 if ((p<0)&&(n<0)){
		            throw new Exception ("n and p should not be zero.");
		        }
		  else if ((p==0)&&(n==0)) {
			  throw new Exception("n and p should not be negative.");
		  }
		  else if((p<0)||(n<0)) {
			  throw new Exception("neither n and p should not be negative.");
		  }
		
		return (int) Math.pow(n, p);
	}
   
    
}
public class Task7 {
	public static final MyCalculator1 my_calculator = new MyCalculator1();
    public static final Scanner in = new Scanner(System.in);
public static void main(String[] args) {
	while (in .hasNextInt()) {
        int n = in .nextInt();
        int p = in .nextInt();
        
        try {
            System.out.println(my_calculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
}
