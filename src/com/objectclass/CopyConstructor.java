package com.objectclass;//package should be in com.objectclass

public class CopyConstructor {
	String n;
	int num;
	CopyConstructor(String name, int id){
		n=name;
		num=id;
		
	}
	CopyConstructor(CopyConstructor C){
		n = C.n;
		num =C.num;
		
	}
	void display() {
		System.out.println(n+" "+num);
		
	}
public static void main(String[] args) {
	
	CopyConstructor con = new CopyConstructor("abi",123);//should be in small letter
	CopyConstructor con1 = new CopyConstructor(con);//should be in small letter
	con.display();
	con1.display();
	
}
}
