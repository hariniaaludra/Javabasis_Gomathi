package Encapsulation;
 class Name{
private String myName;
//public String setName;
public String getName() {
	return myName;
}
public void setName(String name){
	this.myName = name;	
}
}
public class GetSetValue {
public static void main(String[] args) {
	Name obj = new Name();
	obj.setName ("gomathi");
	System.out.println(obj.getName());
	
}
}
 