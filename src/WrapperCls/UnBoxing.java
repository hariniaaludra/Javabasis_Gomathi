package WrapperCls;//package should be in com.wrappercls

public class UnBoxing {
public static void main(String[] args) {
	
	
	Integer s = new Integer(10);//should be in small letter
	int i = s.intValue();
	int j =i;
	System.out.println(s + " "+ i + " " + j);
	
}
}
