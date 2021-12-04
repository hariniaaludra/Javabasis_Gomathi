package com.udemyPracticalFinalKeyWord;

public class Country {
	private final String name = "India ";
	private int population;
	private String capital;

	public final String Country1(int population, String capital) {
		this.population = population;
		this.capital = capital;
		return name + population + capital;

	}

	public final int populationChange(int change) {
		return population += change;
	}

}
