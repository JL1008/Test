package 课后习题线程;

public class Example08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Teacher tr=new Teacher();
		new Thread(tr,"老师1").start();
		new Thread(tr,"老师2").start();
		new Thread(tr,"老师3").start();
		new Thread(tr,"老师4").start();

	}

}
class Teacher implements Runnable{
	private int notes=80;
	public void run() {
		while(true) {
			if(notes>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在发第"+notes--+"份笔记");
			}
		}
	}
}