package evaluationTask;
import java.util.Scanner;

import MyRegex;

public class Anegram1 {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        while(in.hasNext()){
		            String IP = in.next();
		            System.out.println(IP.matches(new MyRegex().pattern));
		        }

		    

	}

}
