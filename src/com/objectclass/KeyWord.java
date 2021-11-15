package com.objectclass;//package should be in com.objectclass

public class KeyWord {
	void fact(int n){
		int f = 1;
		for(int i=1; i<=n; i++) {
			f = f*i;
			
		}
		System.out.println(f);
	
		
	}
	public static void main(String[] args) {
		new KeyWord().fact(10);
	}
	
	

}
