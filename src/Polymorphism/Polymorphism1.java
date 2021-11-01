package Polymorphism;
 class College{
	
	public void details(String name,int id, String university) {//method name should be in small letter
		
		System.out.println("College details: "+ name + id + university );
		}
	
}
 class FstStudent extends College{
	 public void details(String name,int id, String department) {
		 	 
		 System.out.println("student details: "+ name + id + department);
	 }
 }
 class SecStudent extends College{
	 public void details(String name,int id, String department) {
		 
		 System.out.println("student details: "+ name + id + department );
	 }
 }
public class Polymorphism1 {
public static void main(String[] args) {
	College obj = new College();
	//FstStudent obj1 = new FstStudent();
	//SecStudent obj2 = new SecStudent();
	obj.details("CMS",7204, "Anna University");
	obj.details("Abi",720401, "CSE");
	obj.details("Angel",720402, "ECE");
	
}
}
