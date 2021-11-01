package Polymorphism;
 class College{
	
	public void Details(String name,int id, String University) {//method name should be in small letter
		
		System.out.println("College details: "+ name + id + University );
		}
	
}
 class FstStudent extends College{
	 public void Details(String name,int id, String Department) {
		 	 
		 System.out.println("student details: "+ name + id + Department);
	 }
 }
 class SecStudent extends College{
	 public void Details(String name,int id, String Department) {
		 
		 System.out.println("student details: "+ name + id + Department );
	 }
 }
public class Polymorphism1 {
public static void main(String[] args) {
	College obj = new College();
	//FstStudent obj1 = new FstStudent();
	//SecStudent obj2 = new SecStudent();
	obj.Details("CMS",7204, "Anna University");
	obj.Details("Abi",720401, "CSE");
	obj.Details("Angel",720402, "ECE");
	
}
}
