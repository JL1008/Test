package �κ�ϰ���߳�;

public class Example06 {

	public static void main(String[] args) {
		MyThread1 myThread=new MyThread1();
		myThread.run();
	System.out.println("�߳�1");
			
	

	}

}
class MyThread1{
	public void run() {
		
	System.out.println("�߳�2");	
		
	}
}
