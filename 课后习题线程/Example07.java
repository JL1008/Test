package 课后习题线程;

public class Example07 {

	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		Thread thread=new Thread(myThread);
		thread.start();
		for(int i=1;i<=100;i++) {
			System.out.println("main");
		}

	}

}
class MyThread implements Runnable{
	public void run() {
		for(int j=0;j<50;j++) {
			System.out.println("new");
		}
	}
}