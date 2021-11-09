package StringHandling;
class StringContains{
	
	void display() {
		String message = "What do know about me";
		if(message.contains("do know")){
			System.out.println("ture");
		}
		else {
			System.out.println("not found");
		}
    
    
    
}
}
public class Contains {
	public static void main(String[] args) {
		StringContains msg = new StringContains();
		msg.display();
		
	}

}
