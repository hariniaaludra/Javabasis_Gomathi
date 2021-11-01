package SecondPackage;
import FirstPackage.*;//import FirstPackage.FirstClass;-->pakage with class --//import package name .class name
public class SecondClass {
	public static void main(String[] args) {
		FirstClass obj1 = new FirstClass();
		obj1.string();
		obj1.string1();
		obj1.stringchar();
	}

}
