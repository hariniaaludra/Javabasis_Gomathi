package com.udemyJavaPracticiesTask;

public class Building {
	private String name;
	private Items[] items;
	public Building(String name, Items[] items) {
		
		this.name = name;
		this.items = items;
	}
	public String getName() {
		return name;
	}
	
	public Items[] getItems() {
		return items;
	}
	

}
