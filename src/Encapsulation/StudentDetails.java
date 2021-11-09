package Encapsulation;
class Student{
	private String Name;
	private int id;
	private float Precentage;
	
	public String getName() {
		return Name;
	}
	public int getId() {
		return id;
	}
	public float getPrece() {
		return  Precentage;
	}
 public void setName(String StudentName) {
		Name = StudentName;
	}
 public void setId(int StudentId) {
		id = StudentId;
	}
 public void setPrecentage(float StudentPrecentage) {
	 Precentage = StudentPrecentage;
	}
	
}
public class StudentDetails {
	public static void main(String[] args) {
		Student details = new Student();
		details.setName("Gomathi");
		details.setId(123);
		details.setPrecentage(60);
		System.out.println("name: "+details.getName() );
		System.out.println("id: "+ details.getId());
		System.out.println("Precentage: "+details.getPrece());
	}

}
