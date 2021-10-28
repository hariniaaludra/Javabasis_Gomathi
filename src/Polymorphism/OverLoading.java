package Polymorphism;

public class OverLoading {
	void interest(int a,int b) {
		System.out.println(a+b);
	}


void interest(int a,int b,int c) {
	System.out.println(a+b);
	}
public static void main(String[] args) {
	//OverLoading d1;
	OverLoading obj = new OverLoading();
	obj.interest(5,6);
	obj.interest(7,8,4);
}
}
