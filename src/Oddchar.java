
public class Oddchar {
	public static void main() {
		String s1 = "Team work makes the dream work"; //for integers int a=123456789;
		for(int i = 0; i<s1.length(); i++) { //same
			if(i%2!=1) {
				System.out.println(s1.charAt(i)); //it print the odd numbers
				
			}
			
		}
		System.out.println();

}
}