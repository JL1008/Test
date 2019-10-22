package 课后习题线程;



public class tw extends Thread{
	public tw(String name) {
		super(name);
	}


public void run() {
	System.out.println(this.getName());
}
public static void main(String[] args) {
	new tw("Thread1").start();
	new tw("Thread2").start();
}}