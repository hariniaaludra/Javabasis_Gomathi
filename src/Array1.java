
public class Array1 {
	static int[] get() {
		
		return new int[] {10,20,30,40};
	}
	public static void main(String[] args) {
		int arr[]=get();
		int sum =0;
		for (int i = 0; i < arr.length; i++)
		{  
	    sum = sum + arr[i]/3;
	    
	    System.out.println(sum);  
	    
		}
	}
	

}
