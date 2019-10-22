package 学习通作业;



public class Example09 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Tax te=new Tax();
		new Thread(te,"第1辆出租车").start();
		new Thread(te,"第2辆出租车").start();
		new Thread(te,"第3辆出租车").start();
		new Thread(te,"第4辆出租车").start();
		new Thread(te,"第5辆出租车").start();

	}

}
class Tax implements Runnable{
	private int people=100;
	public void run() {
		while(true) {
			if(people>0) {
				Thread th=Thread.currentThread();
				String th_name=th.getName();
				System.out.println(th_name+"正在接送第"+people--+"个人");
			}
		}
	}
}