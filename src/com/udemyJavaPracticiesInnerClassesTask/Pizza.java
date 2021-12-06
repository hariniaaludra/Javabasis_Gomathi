package com.udemyJavaPracticiesInnerClassesTask;

import com.udemyJavaPracticiesEnumTask.PizzaSize;

public class Pizza {
	private String name;
	private PizzaSize pizzaSize;
	private boolean extraTomatoSauce;
	private boolean salad;
	public Pizza(Builder builder) {
		
		this.name = builder.name;
		this.pizzaSize = builder.pizzaSize;
		this.extraTomatoSauce = builder.extraTomatoSauce;
		this.salad = builder.salad;	
	}

	public String getName() {
		return name;
	}
	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}
	public boolean isExtraTomatoSauce() {
		return extraTomatoSauce;
	}
	public boolean isSalad() {
		return salad;
	}
	public static class Builder{
		private String name;
		private PizzaSize pizzaSize;
		private boolean extraTomatoSauce;
		private boolean salad;
		
		public Builder(String name, PizzaSize pizzaSize) {
			this.name = name;
			this.pizzaSize = pizzaSize;
		}
		public Builder withTomatoSauce(boolean extraTomatoSauce) {
			this.extraTomatoSauce = extraTomatoSauce;
			return this;
			
		}
		public Builder withSalad(boolean salad) {
			this.extraTomatoSauce = extraTomatoSauce;
			return this;
			
		}
		public Pizza build() {
			return new Pizza(this);
			
		}
		
	}
	

}
