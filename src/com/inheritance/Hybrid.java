package com.inheritance;
class X{
	int a;
	int b;

		void getdata() {
			a=10;
			b= 20;
			System.out.println(a+b);
		}
	}
	class Y extends X{
		void getdata1() {
			a=10;
			b= 20;
			System.out.println(a-b);
		}
	}
	class Z extends Y{
		void getdata2() {
			a=10;
			b= 20;
			System.out.println(a*b);
		}
	}
public class Hybrid {
		
	public static void main(String[] args) {
		Z obj1 = new Z();
		Y obj2 = new Y();
		obj2.getdata();
		obj2.getdata1();
		obj1.getdata2();
	}

}
