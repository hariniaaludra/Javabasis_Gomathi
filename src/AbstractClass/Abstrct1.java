package AbstractClass;

public class Abstrct1 {
	  void run() { //we can create static and don't wants to create the object name.
		System.out.println("Next Step");
	}
	public static void main(String[] args)
	{
		Abstrct1 obj = new Abstrct1();
		obj.run();
	}
}
