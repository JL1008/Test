package factory;
import tv.TV;
import tv.HaierTV;
import tv.HisenseTV;
public class TVFactory{
	public static TV produceTV(String brand) {
		if(brand.equals("HaierTV"))
			return new HaierTV();
		if(brand.equals("HisenseTV"))
			return new HisenseTV();
		return null;
	}
}