package com.udemyJavaPracticies;

public class OperatorsTask {
	String carModel = "Dodge Challenger SRT 392";
	int price = 14999;
	int moneyInTheBank = 100000;
	boolean isDamaged = true;

	public String newCarDetails() {
		String newCar = "Price of a " + carModel + ": €" + price;
		int increasedPrice = price + 1000;
		int decreasedPrice = price - 1000;
		int twoCarsPrice = price * 2;
		int dodgesYouCanBuy = moneyInTheBank / price;
		int moneyRemaining = moneyInTheBank % price;
		return "New Car Details: " + newCar + "\n" + "The increased price of a " + carModel + ": €" + increasedPrice
				+ "\n" + "The decreased price of a " + carModel + ": €" + decreasedPrice + "\n" + "Two " + carModel
				+ ": €" + twoCarsPrice + "\n" + "From the money we have in the bank we can buy " + dodgesYouCanBuy + " "
				+ carModel + "\n" + "Money we would remain after buying " + dodgesYouCanBuy + " " + carModel + ": €"
				+ moneyRemaining;

	}
	public  String priceNegativity() {
		int priceNegative = -14999;
		int priceNegativeWithPlusSign = +priceNegative;
		int priceNegativeWithMinusSign = -priceNegative;
		int priceOneEuroIncrease = ++price;
		int priceOneEuroDecrease = --price;
		return "Negative price with plus sign: €" + priceNegativeWithPlusSign +"\n"+ "Negative price with minus sign: €" + priceNegativeWithMinusSign +
				"\n"+ "Price after 1 euro price increase: €" + priceOneEuroIncrease + "\n"+ "Price after 1 euro price decrease: €" + priceOneEuroDecrease + "\n"+ "This car is damaged: " + !isDamaged;
	}
	public void priceCheck() {

		System.out.println("Car's price equals the money in the bank: " + (price == moneyInTheBank));
		System.out.println("Car's price doesn't equal the money in the bank: " + (price != moneyInTheBank));
		System.out.println("Car's price is greater than the money in the bank: " + (price > moneyInTheBank));
		System.out.println("Car's price is lesser than the money in the bank: " + (price < moneyInTheBank));
		System.out.println("Car's price is greater than or equals the money in the bank: " + (price >= moneyInTheBank));
		System.out.println("Car's price is lesser or equals than the money in the bank: " + (price <= moneyInTheBank));
		System.out.println("The carModel variable's datatype is a String: " + (carModel instanceof String));
	
	}

	public static void main(String[] args) {
		OperatorsTask operators = new OperatorsTask();
		System.out.println(operators.newCarDetails());
		System.out.println(operators.priceNegativity());
		operators.priceCheck();
		System.out.println(operators);

		String damagedText =operators. isDamaged ? "The car is damaged" : "The car isn't damaged";
		System.out.println(damagedText);
		System.out.println();

		String worthSeeingText = !operators.isDamaged || operators.price <= 20000 ? "It's worth seeing the car"
				: "It isn't worth seeing the car";
		System.out.println(worthSeeingText);
		String worthRepairingText = operators.isDamaged && operators.price <= 10000 ? "It's worth repairing the car"
				: "It isn't worth repairing the car";
		System.out.println(worthRepairingText);

		operators.price += 1000;
		System.out.println("Price increased: €" +operators.price);
		operators.price -= 2000;
		System.out.println("Price decreased: €" + operators.price);
		operators.price *= 2;
		System.out.println("Price multiplied: €" + operators.price);
		operators.price /= 2;
		System.out.println("Price divided: €" + operators.price);
		operators.price %= 10000;
		System.out.println("Price remained: €" + operators.price);
	}

}
