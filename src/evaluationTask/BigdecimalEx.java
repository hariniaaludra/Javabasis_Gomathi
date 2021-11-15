package evaluationTask;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.TreeSet;

public class BigdecimalEx {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 TreeSet<BigDecimal> list = new TreeSet<BigDecimal>();
     int testCase = input.nextInt();

     while(testCase-- > 0)
         list.add(new BigDecimal(input.next()));

     System.out.println(list); //ascending order
     System.out.println(list.descendingSet()); 
}
}
