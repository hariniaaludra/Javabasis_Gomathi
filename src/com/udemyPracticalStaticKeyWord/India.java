package com.udemyPracticalStaticKeyWord;

public class India {

	public static void main(String[] args) {
		  System.out.println("Number of countries: " + Country.getNumberOfCountries());
	        Country brazil = new Country("Brazil", 210000000, "Brasilia");
	        brazil.getDetails();
	        Country germany = new Country("Germany", 83000000, "Berlin");
	        germany.getDetails();
	        Country japan = new Country("Germany", 12500000, "Tokyo");
	        japan.getDetails();
	        System.out.println("Number of countries: " + Country.getNumberOfCountries());
	}

}