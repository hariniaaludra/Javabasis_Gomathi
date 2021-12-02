package com.inheritanceUdemyPractical2;

public class Team {

	public static void main(String[] args) {
		
		
		Decathlon decothlon = new Decathlon("diana", 1999, "Spartance", 50, 160);
		decothlon.getBio();
		System.out.println(decothlon.getName());
		Heptathlon heptatholon = new Heptathlon("karthiga", 1999, "Spartance", 50, 110);
		heptatholon.getBio();
		System.out.println(heptatholon.getName());
	}

}
