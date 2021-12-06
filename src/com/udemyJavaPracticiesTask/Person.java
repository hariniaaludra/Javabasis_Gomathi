package com.udemyJavaPracticiesTask;

public abstract class Person {
	private String name;
	private String nickname;
	private int yearOfBorn;
	private String expertIn;
	private Items[] items;
	public Person(String name, String nickname, int yearOfBorn, String expertIn, Items[] items) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.yearOfBorn = yearOfBorn;
		this.expertIn = expertIn;
		this.items= items;
	}
public void bioData() {
	System.out.println("Name: "+ name +"\n"+ "NickName: " + nickname +"\n"+"Year Of Born: " +"\n"+ yearOfBorn + "\n"+"ExpertIn: "+"\n"+ expertIn);
	for(Items items: items) {
		System.out.println(items.getName());
	}
}
public String getName() {
	return name;
}
/*public void setName(String name) {
	this.name = name;
}*/
public String getNickname() {
	return nickname;
}
/*public void setNickname(String nickname) {
	this.nickname = nickname;
}
*/
}
