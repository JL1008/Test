package 课后习题线程;

public class Example06 {

	public static void main(String[] args) {
		MyThread1 myThread=new MyThread1();
		myThread.run();
	System.out.println("线程1");
			
	

	}

}
class MyThread1{
	public void run() {
		
	System.out.println("线程2");	
		
	}
}
