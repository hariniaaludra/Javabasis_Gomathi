
public class Index {
	public static void main(String[] args) {
		
		String s1 = "Gomathi"; //declare the s1 and s2 in same string
		String s2 = "Team work makes the dream work";
		int len = s2.length(); // directly print in the print statement(system.out.println(s2.charAt(s2.length()-1)))
		char ch = s1.charAt(6); // this also directly print in the print statement
		System.out.println(ch);
		System.out.println(s2.length());
		System.out.println("first intex value: " +s2.charAt(0));
		
		System.out.println("Last intex value: " +s2.charAt(len-1));// by using len variable we directly use length method (s2.chraAt(s2.length()-1))
	}

}
