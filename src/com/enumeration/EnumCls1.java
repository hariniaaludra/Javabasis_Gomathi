package com.enumeration;//package should be in com.enumeration

 enum Month{
	jan, feb,mar
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
