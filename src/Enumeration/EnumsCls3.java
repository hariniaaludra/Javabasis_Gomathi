package Enumeration;
  enum Months{
	JAN(1,"Jaunary"),
	FEB(2,"February"),
	MAR(3, "march"),
	APR(4,"April"),
	MAY(5,"May"),
	JUN(6,"June"),
	JULY(7,"July"),
	AUG(8,"Augest"),
	SEP(9, "September"),
	OCT(10, "October"),
	NOV(11,"November"),
	DEC(12,"December");
	int value;
	String month;
	Months(int num,String s){
		value = num;
		month = s;
			
		}
}
class ClassA{
public static void PrintMonth(Months Mon) {
	if(Mon>=12) {
		System.out.println();
	}
}
	
}
public class EnumsCls3 {
	

	public static void main(String[] args) {
	
	}

}
