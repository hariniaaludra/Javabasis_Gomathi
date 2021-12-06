package com.udemyJavaPracticiesInnerClassesTask;

import com.udemyJavaPracticiesEnumTask.PizzaSize;

public class PizzaBuilder {

	public static void main(String[] args) {
		 Pizza pizza = new Pizza.Builder("Pizza cake", PizzaSize.LARGE)
	                .withTomatoSauce(true)
	                .withSalad(true)
	                .build();
	        System.out.println("Name: " + pizza.getName());
	        System.out.println("Size: " + pizza.getPizzaSize().getPizzaSizeText());
	        System.out.println("Extra tomato sauce: " + pizza.isExtraTomatoSauce());
	        System.out.println("Salad: " + pizza.isSalad());

	}

}
