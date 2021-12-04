package com.udemyPracticalStaticKeyWord;

public class Country {
	private static int numberOfCountries;
    private final String name;
    private int population;
    private String capital;
    
    	static {
    		numberOfCountries = 5;
    	}

		public Country(String name, int population, String capital) {
			
			this.name = name;
			this.population = population;
			this.capital = capital;
			numberOfCountries++;
		}
		public final int populationChange(int change){
	        return  population += change;
	    }
		public void getDetails() {
	        System.out.println("Country name: " + name + " Population: " + population + " Capital: " + capital);
	    }
		 public static int getNumberOfCountries() {
		        return numberOfCountries;
		    }
		 static {
	    		numberOfCountries = 0;
	    	}

		
}
