
public class OddStr {
	public static void main(String[] args) {
	String s1 = "Team work makes the dream work";
	for(int i = 0; i<s1.length()-1; i++) {
		if(i%2!=0) {
			
			System.out.println("char "+i+" place "+s1.charAt(i));
			
		}
		
	}
	System.out.println();
}
}