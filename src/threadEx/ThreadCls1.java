package threadEx;//package should be in com.threadex

public class ThreadCls1 extends Thread {
public void run() {
	for(int i = 0 ; i<10; i++) {
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		ThreadCls1 thread = new ThreadCls1();
		thread.start();
		
		
	
	}

}
