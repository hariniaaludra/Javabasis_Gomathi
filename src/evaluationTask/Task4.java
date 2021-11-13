package evaluationTask;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		try {
			int x = input.nextInt();
			int y =input.nextInt();
			
				System.out.println(x/y);
			}
			
			
	
		catch(ArithmeticException|InputMismatchException e){
			if(e instanceof ArithmeticException) {
				System.out.println(e);
			}
			else if (e instanceof InputMismatchException) {
				System.out.println(e);
			}
		
		}
	
		

	}

}
