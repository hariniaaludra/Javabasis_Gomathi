package Encapsulation;

class Name {
	private String myName;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}


}

public class GetSetValue {
	public static void main(String[] args) {
		Name obj = new Name();
		obj.setMyName("gomathi");
		System.out.println(obj.getMyName());

	}
}
