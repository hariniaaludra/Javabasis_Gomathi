package WrapperCls;

public class UnBoxing {
public static void main(String[] args) {
	int i = 10;
	byte c = 12;
	short d = 20;
	char j = 'A';
	boolean k = false;
	float a = 12.3f;
	double b = 13.8d;
	
	
	Integer S = new Integer();
	int i = S.intValue();
	int j =i;
	System.out.println(j);
	
}
}
