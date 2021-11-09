package StringHandling;

import java.util.StringTokenizer;

public class StringTokens {
public static void main(String[] args) {
	StringTokenizer name = new StringTokenizer("Im a software trainee");
	while(name.hasMoreTokens()) {
	System.out.println(name.nextToken());
	System.out.println(name.countTokens());
	}
}
}
