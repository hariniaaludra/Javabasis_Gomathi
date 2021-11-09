package StringHandling;

public class ToStringMethod {
	int rollno;
	String name;
	String city;
	ToStringMethod(int rollno, String name, String city){
		this.rollno = rollno;
		this.name = name;
		this.city = city;
		
		
		
	}
	public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
	}
public static void main(String[] args) {
	ToStringMethod  str1 = new ToStringMethod (101,"abi","palladam");
	ToStringMethod  str2 = new ToStringMethod (102, "Angel", "Coimbatore");
	System.out.println(str1.toString());
	System.out.println(str2.toString());
	
	
}
}
