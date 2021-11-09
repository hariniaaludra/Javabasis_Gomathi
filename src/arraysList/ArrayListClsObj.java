package arraysList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClsObj {
	int rollno;
	String name;
	int age;
	
	ArrayListClsObj(int rollno, String name, int age){
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListClsObj s1 = new ArrayListClsObj(1 , "abi", 22);
		ArrayList<ArrayListClsObj>student= new ArrayList<ArrayListClsObj>();
		student.add(s1);
		Iterator itr = student.iterator();
		while(itr.hasNext()) {
			ArrayListClsObj st=(ArrayListClsObj)itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
