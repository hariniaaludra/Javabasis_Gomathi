package com.udemyJavaPracticiesTask;

public class Criminal extends Person {
	
	public static final int SUCCESS_PERCENTAGE = 10;
	int successPersentage;
	public Criminal(String name, String nickname, int yearOfBorn, String expertIn,Items[] items) {
		super(name, nickname, yearOfBorn, expertIn, items);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void bioData() {
		System.out.println("Criminal Person:");
		super.bioData();
	}

}
