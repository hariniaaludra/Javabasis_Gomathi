package com.encapsulation;//package should be in com.encapsulation
class Student{
	private String name;//should be in small letter
	private int id;
	private float precentage;//should be in small letter
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public float getPrece() {
		return  precentage;
	}
 public void setName(String StudentName) {
		name = StudentName;
	}
 public void setId(int StudentId) {
		id = StudentId;
	}
 public void setPrecentage(float StudentPrecentage) {
	 precentage = StudentPrecentage;
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
