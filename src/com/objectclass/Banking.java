package com.objectclass;//package should be in com.objectclass
import java.util.Scanner;

class Amount{
	int accountno;//should be in small letter
	String name;
	float amount;
	
	
	void insert() {
		Scanner abc = new Scanner(System.in);
		System.out.println("Enter your Account Number");
		accountno = abc.nextInt();
		System.out.println("Enter your name");
		 name = abc.next();
		 System.out.println("Enter your amount");
		 amount = abc.nextFloat();
		//AccountNo = acc;
		//name =n;
		//amount = amt;
	}
	void widthdraw(float amt) {
		if(amount<amt) {
			
			System.out.println("insufficiant balance");
		}
		else {
			amount = amount-amt;
			System.out.println("Balance"+ amt);
		}
		
	}
	void deposite(float amt) {
		amount = amount + amt;
		System.out.println("Deposite"+ amt);
	}
	void balance() {
		System.out.println(amount);
	}
	void display() {
		System.out.println("account no:"+accountno );
		System.out.println("name:"+name);
		System.out.println("amount"+amount);
	}
	
	
	
}

public class Banking {
	public static void main(String[] args) {
		
		
		Amount bank = new Amount();
		bank.insert();
		bank.widthdraw(1000);
		bank.deposite(3000);
		bank.display();
		bank.balance();
		System.out.println();
		
	}

}