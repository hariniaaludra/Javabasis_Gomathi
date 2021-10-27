package FirstPackage;

public class FirstClass {
	public void string() {
	String name = "Gomathi";
	String s1 = String.format(name) ;
	String s2 = String.format("%d",1284) ;
	String s3 = String.format("%f", 12.5);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	}
	public void string1() {
		String s4 = "Abi";
		byte[] str = s4.getBytes();
		for(int i = 0;i<str.length;i++) {
			System.out.println(str[i]);
			
		}
		
		
	}
	public void stringchar() {
		String name1 = "Hellow world";
		char[] ch = new char[5];
		name1.getChars(5,10,ch,0);
		System.out.println(ch);
		
	}
}
