import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n;
		int i,sum=0;
		Scanner reader=new Scanner(System.in);
		n=reader.nextInt();
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(+sum);

	}
}
