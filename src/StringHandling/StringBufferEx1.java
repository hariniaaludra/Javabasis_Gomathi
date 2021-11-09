package StringHandling;
//String buffer-mutable sring, it can be changed
//StringBuffer(), StringBuffer(String str), StringBuffer(int capacity)
public class StringBufferEx1 {
	

	public static String concatWithString(){
		String name = "Gomathi";
		for(int i = 0;i<100;i++) {
			name = name + "Kanagaraj";
			
		}
		
		return name;
		
	}
	public static String concatWithStringBuffer(){
		StringBuffer secondName = new StringBuffer("Gomathi");
		for(int i = 0;i<100;i++) {
			secondName.append("Kanagaraj");
			
		}
		
		return secondName.toString();
	}
public static void main(String[] args) {
	long startTime = System.currentTimeMillis();  
	concatWithString();
	   
	System.out.println(System.currentTimeMillis()-startTime);
	startTime = System.currentTimeMillis();
	concatWithStringBuffer();
	System.out.println(System.currentTimeMillis()-startTime);
	StringBuilder firstString = new StringBuilder("Hello");
	System.out.println(firstString.hashCode());
	System.out.println(firstString.capacity());
	firstString.reverse();
	firstString.append(" Good morning");
	firstString.insert(5, " hi");
	firstString.replace(5,6, " Welcome ");
	firstString.delete(2,4);
	
	System.out.println(firstString);
}
}
