import tv.TV;
import tv.HaierTV;
import tv.HisenseTV;
import factory.TVFactory;
import utility.XMLUtilTV;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TV tv;
		String brandName = XMLUtilTV.getBrandName();
		tv = TVFactory.produceTV(brandName);
		tv.play();

	}

}
