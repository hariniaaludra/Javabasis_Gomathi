package Enumeration;

 enum Month{
	jan, feb,mar //should be in capital
}


public class EnumCls1 {
	public static void main(String[] args) {
	
	System.out.println("To display list of months");
	Month mon[] = Month.values();
	for(Month a : mon) {
		
		System.out.println(a.ordinal());
	}
	
	Month cal = Month.valueOf("jan");
    System.out.println("Value is:" + cal);
	
	}
}
