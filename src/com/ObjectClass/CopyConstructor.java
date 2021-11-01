package com.ObjectClass;

public class CopyConstructor {
	String n;//variables are not in propername;
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
	
	CopyConstructor Con = new CopyConstructor("abi",123);
	CopyConstructor Con1 = new CopyConstructor(Con);
	Con.display();
	Con1.display();
	
}
}
