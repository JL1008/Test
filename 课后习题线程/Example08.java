package �κ�ϰ���߳�;

public class Example08 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Teacher tr=new Teacher();
		new Thread(tr,"��ʦ1").start();
		new Thread(tr,"��ʦ2").start();
		new Thread(tr,"��ʦ3").start();
		new Thread(tr,"��ʦ4").start();

	}

}
class Teacher implements Runnable{
	private int notes=80;
	public void run() {
		while(true) {
			if(notes>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"���ڷ���"+notes--+"�ݱʼ�");
			}
		}
	}
}