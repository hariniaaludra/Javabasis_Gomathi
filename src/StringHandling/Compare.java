package StringHandling;
//syntax: public int compareTo(String anotherString)
public class Compare {
	public static String comparestr(String firstName, String secondName ) {
		 
		
	
		 String result = "result= "+ (firstName.compareTo(secondName));
			return result ;
		
		
	}
public static void main(String[] args) {
	Compare  stirngObject = new Compare();
	System.out.println(Compare.comparestr("abi","Nandhu"));
	
	
	
}
}
