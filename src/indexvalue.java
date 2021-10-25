import comhello.Index;

public class indexvalue {
	String s1;
	private char[] ch;
	public  indexvalue() {
		s1 = "hello";
		char ch = s1.charAt(2);
	}
	public static void main(String[] args) {
		
		indexvalue a = new indexvalue();
		System.out.println(a.s1);
		
		System.out.println(a.ch);
	}

}
/*public class Index {
String s1;
char s2;
public  Index() {
	s1 = "hello";
 s2=s1.charAt(2);
//System.out.println(s2);
}
public static void main(String[] args) {
	
	Index a = new Index();
	System.out.println(a.s1);
	System.out.println(a.s2);
	
}

}*/

