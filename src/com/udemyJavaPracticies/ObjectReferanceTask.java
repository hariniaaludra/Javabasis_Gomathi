package com.udemyJavaPracticies;

public class ObjectReferanceTask {
	public String studentDetails() {
		Byte numberOfSubject = 5;
		Short numberOfDaysPresent = 200;
		Integer semFee = 14999;
		Long registrationNumber = 72041001L;

		Float totalPrecentage = 85.9F;
		Double attendancePrecentage = 80.23;

		Boolean StudentPresent = true;
		String studentName = "Gomathi";
		String department = "IV-CSE";
		Character classSection = 'A';

		String collegeName = "CMS College of engineering and technology";
		String collegeNamenew = new String("CMS College of engineering and technology");
		return "Student Details:" + "\n" +"collegeName: "+ collegeName.toUpperCase() + "\n" + "StudentPresent: "+StudentPresent + "\n"
				+"StudentName: " +studentName.toUpperCase() + "\n" + "Department: "+department + "\n" +"Section: "+ classSection + "\n" +"RegistraterNumber: "+ registrationNumber.intValue() + "\n"
				+ "NumberOfDaysPresent: "+numberOfDaysPresent.intValue() + "\n" +"AttendancePrecentage: "+ attendancePrecentage.floatValue() + "\n" +"Subjects: "+ numberOfSubject.intValue() + "\n" +"TotalPrecentage: "+ totalPrecentage
				+ "\n" +"SemFee: "+ semFee.floatValue();

	}

	public static void main(String[] args) {

		ObjectReferanceTask objectReferance = new ObjectReferanceTask();
		System.out.println(objectReferance.studentDetails());

	}
}
