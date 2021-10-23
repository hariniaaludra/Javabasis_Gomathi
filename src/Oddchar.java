
public class Oddchar {
	public static void main() {
		String s1 = "Team work makes the dream work";
		for(int i = 0; i<s1.length(); i++) {
			if(i%2!=1) {
				System.out.println(s1.charAt(i));
				
			}
			
		}
		System.out.println();

}
}