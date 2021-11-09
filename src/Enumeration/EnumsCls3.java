package Enumeration;



public class EnumsCls3 {
	
	enum Months{
		JAN("1","January"),
		FEB("2","February"),
		MAR("3", "march"),
		APR("4","April"),
		MAY("5","May"),
		JUN("6","June"),
		JULY("7","July"),
		AUG("8","August"),
		SEP("9", "September"),
		OCT("10", "October"),
		NOV("11","November"),
		DEC("12","December");
		 String num;
		 String month;
		Months(String num,String month)
		{
		this.num = num;
			this.month =  month;
				
			}
		public static String findenum(String num) {
			for (Months value : Months.values()) {
				if (value.num.equals(num)) {
					System.out.println(value.month);
			}
				
			
		}
       return " ";
		}
	}
	public static void main(String[] args) {
		

	
	}

}
	
	
	
	/*
	 * public class Enumcondition {
	enum SampleEnum {
		INR("#", "India"), DOL("$", "usa"), EUR("@", "europe");
		String name, string2;
		SampleEnum(String name, String string2) {
			this.name = name;
			this.string2 = string2;
		}
		public static boolean findenum(String name) {
			for (SampleEnum value : SampleEnum.values()) {
				if (value.name.equals(name)) {
					return true;
				}
			}
			return false;
		}

	 */
