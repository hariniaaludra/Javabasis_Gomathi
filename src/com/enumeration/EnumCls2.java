package com.enumeration;

public class EnumCls2 {
enum Day{
	Monday("abi"),Tuesday("Angel"),Wednesday("nandhu"),Thursday("shalu"),Friday("gomathi");
	String value;
   Day(String num){
	value = num;
		
	}
}
public static void main(String[] args){
	for(Day d :Day.values())//should be in small letter
	System.out.println(d+" "+d.value);
	Day s = Day.valueOf("Monday");
	 System.out.println("Value is:" + s);
}

}
