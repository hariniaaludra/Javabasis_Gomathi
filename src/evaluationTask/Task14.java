package evaluationTask;//package should be in com.evaluationtask
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
interface performOperation {
	 boolean check(int a);
	}
	class MyMath {
	 public static boolean checker(performOperation p, int num) {
	  return p.check(num);
	 }

public static performOperation isOdd() {
    return evenOdd;
}
public static performOperation isPrime() {
    return prime;
}
public static performOperation isPalindrome() {
    return palindrome;
}

public static performOperation evenOdd  = (num) -> {

    if(num % 2 == 0) 
        return false; 
    else return true;
    
};

public static performOperation palindrome  = (num) -> {
    
  if (num < 0)
        return false;
    int div = 1;
    while (num / div >= 10) {
        div *= 10;
    }
    while (num != 0) {
        int l = num / div;
        int r = num % 10;
        if (l != r)
            return false;
        num = (num % div) / 10;
        div /= 100;
    }
    return true;
    
};

public static performOperation prime = (num) -> {
    
    for(int i=2;i<num;i++) {
        if(num%i==0)
            return 1;
    }
    return 0;
    
};

}
public class Task14 {
public static void main(String[] args) throws IOException {
	MyMath ob = new MyMath();
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  int T = Integer.parseInt(br.readLine());
	  performOperation op;
	  boolean ret = false;
	  String ans = null;
	  while (T--> 0) {
	   String s = br.readLine().trim();
	   StringTokenizer st = new StringTokenizer(s);
	   int ch = Integer.parseInt(st.nextToken());
	   int num = Integer.parseInt(st.nextToken());
	   if (ch == 1) {
	    op = ob.isOdd();
	    ret = ob.checker(op, num);
	    ans = (ret) ? "ODD" : "EVEN";
	   } else if (ch == 2) {
	    op = ob.isPrime();
	    ret = ob.checker(op, num);
	    ans = (ret) ? "PRIME" : "COMPOSITE";
	   } else if (ch == 3) {
	    op = ob.isPalindrome();
	    ret = ob.checker(op, num);
	    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

	   }
	   System.out.println(ans);
	  }
}
}
