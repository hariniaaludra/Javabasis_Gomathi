package threadEx;

public class RunnableInterface implements Runnable {

	public static void main(String[] args) {
		RunnableInterface thread = new RunnableInterface();
		Thread main = new Thread(thread);
		main.start();
		
	}


	public void run() {
	
		for(int i = 10; i>0; i--) {
			System.out.print(i);
		}
	}

}
