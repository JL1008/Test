package ѧϰͨ��ҵ;



public class Example09 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Tax te=new Tax();
		new Thread(te,"��1�����⳵").start();
		new Thread(te,"��2�����⳵").start();
		new Thread(te,"��3�����⳵").start();
		new Thread(te,"��4�����⳵").start();
		new Thread(te,"��5�����⳵").start();

	}

}
class Tax implements Runnable{
	private int people=100;
	public void run() {
		while(true) {
			if(people>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڽ��͵�"+people--+"����");
			}
		}
	}
}