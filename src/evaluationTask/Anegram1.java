package evaluationTask;//package should be in com.evaluationtask
import java.util.Scanner;

import MyRegex;

public class Anegram1 {//spelling mistake

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        while(in.hasNext()){
		            String ip = in.next();//should be in small letter
		            System.out.println(ip.matches(new MyRegex().pattern));
		        }

		    

	}

}
