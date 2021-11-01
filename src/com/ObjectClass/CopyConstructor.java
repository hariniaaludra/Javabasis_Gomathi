package com.ObjectClass;

public class CopyConstructor {
	String strname;//variables are not in propername;
	int num;
	CopyConstructor(String name, int id){
	strname=name;
	num=id;
		
	}
	CopyConstructor(CopyConstructor C){
		strname = C.strname;
		num =C.num;
		
	}
	void display() {
		System.out.println(strname+" "+num);
		
	}
public static void main(String[] args) {
	
	CopyConstructor Con = new CopyConstructor("abi",123);
	CopyConstructor Con1 = new CopyConstructor(Con);
	Con.display();
	Con1.display();
	
}
}
