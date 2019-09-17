class Single{
	private static Single INSTANCE=new Single();
	private Single() {
}
	public static Single getInstance() {
		return INSTANCE;
	};
	}
public class HelloworldSingle {
	public static void main (String[] args) {
		
		System.out.println("hello world!");
	}
}
