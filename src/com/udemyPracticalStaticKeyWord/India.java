package com.udemyPracticalStaticKeyWord;

public class India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Number of countries: " + Country.getNumberOfCountries());
	        Country brazil = new Country("Brazil", 210000000, "Brasilia");
	        brazil.getDetails();
	        Country germany = new Country("Germany", 83000000, "Berlin");
	        germany.getDetails();
	        Country japan = new Country("Japan", 12500000, "Tokyo");
	        japan.getDetails();
	       System.out.println("Number of countries: " + Country.getNumberOfCountries());

	}

}
