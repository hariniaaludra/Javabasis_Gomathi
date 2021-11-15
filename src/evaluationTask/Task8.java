package evaluationTask;//package should be in com.evaluationtask
import java.util.HashMap;
import java.util.Scanner;

public class Task8 {
public static void main(String[] args) {
	HashMap<String,Integer>map = new HashMap<String,Integer>();
	Scanner in = new Scanner(System.in);
	
	int n=in.nextInt();
	in.nextLine();
	for(int i=0;i<n;i++)
	{
		String name=in.nextLine();
		int phone=in.nextInt();
		in.nextLine();
		System.out.println(map.put(name, phone));
	}
	while(in.hasNext())
	{
		String s=in.nextLine();
	}
}
}
