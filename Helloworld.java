class Single{
	private static Single INSTANCE=new Single();
	private Single() {
}
	public static Single getInstance() {
		return INSTANCE;
	};
	}
public class Helloworld {
	public static void main (String[] args) {
		
		System.out.println("hello world!");
	}
}
