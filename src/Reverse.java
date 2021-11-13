
public class Reverse {
	public static void	reverseStr(String[] arr){
			for(int i = arr.length-1; i>=0;i--) {
				System.out.println(arr[i]);
		}
		}
	
	public static void main(String[] args) {
		String[] arr = new String[]{"i","h","t","a","m","o","G"}   ;
		reverseStr(arr);
	
	
		
	}

}