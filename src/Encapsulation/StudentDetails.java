package Encapsulation;

class Student {
	private String name;
	private int id;
	private float precentage;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public float getPrece() {
		return precentage;
	}

	public void setName(String StudentName) {
		name = StudentName;
	}

	public void setId(int StudentId) {
		id = StudentId;
	}

	public void setPrecentage(float studentPrecentage) {
		precentage = studentPrecentage;
	}

}

public class StudentDetails {
	public static void main(String[] args) {
		Student details = new Student();
		details.setName("Gomathi");
		details.setId(123);
		details.setPrecentage(60);
		System.out.println("name: " + details.getName());
		System.out.println("id: " + details.getId());
		System.out.println("Precentage: " + details.getPrece());
	}

}
