package SecondPackage;//package should be in com.secondpackage
import com.firstpackage.*;
public class SecondClass {
	public static void main(String[] args) {
		FirstClass obj1 = new FirstClass();
		obj1.string();
		obj1.string1();
		obj1.stringchar();
	}

}
