package Enumeration;

public class EnumCls2 {
enum Day{
	Monday("abi"),Tuesday("Angel"),Wednesday("nandhu"),Thursday("shalu"),Friday("gomathi");
	String value;
   Day(String num){
	value = num;
		
	}
}
public static void main(String[] args){
	for(Day D :Day.values())
	System.out.println(D+" "+D.value);
	Day S = Day.valueOf("Monday");
	 System.out.println("Value is:" + S);
}

}
