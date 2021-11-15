package threadEx;
class Table{
	synchronized void display(int n) {
		for(int i =1; i<5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500); 
			}catch(Exception e) {
				
			}
		}
	}
}
class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t = t;
	}
	public void run(){  
		t.display(5);  
		}  
}
class MyThread2 extends Thread{
	Table t;
	MyThread2(Table t){
		this.t = t;
	}
	public void run(){  
		t.display(100);  
		}  
}

public class ThreadEx1 {

	public static void main(String[] args) {
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}



}
