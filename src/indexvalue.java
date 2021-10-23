
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
