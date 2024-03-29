import java.util.*;

public class Customer {
	private String _name;
	private Vector _rentals=new Vector();
	public	Customer(String name) {
		_name=name;
	}
	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}
	public String getName() {
		return _name;
	}
	public String statement() {
//		double totalAmount=0;
//		int frequentRenterPoints=0;
		Enumeration rentals=_rentals.elements();
		String result="Rental Record for"+getName()+"\n";
		while(rentals.hasMoreElements()) {
//			double thisAmount=0;
			Rental each=(Rental)rentals.nextElement();
//			thisAmount=each.getCharge();
//			frequentRenterPoints+=each.getFrequentRenterPoints();
			/*if((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDaysRented()>1)
			frequentRenterPoints++;*/
			result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
//			totalAmount+=each.getCharge();
		}
		result+="Amount owed is"+String.valueOf(getTotalCharge())+"\n";
		result+="You earned"+String.valueOf(getTotaIFrequentRenterPoints())+"frequent renter points";
		return result;
	}
	private int getTotaIFrequentRenterPoints() {
		int result=0;
		Enumeration rentals=_rentals.elements();
		while(rentals.hasMoreElements()) {
			Rental each=(Rental)rentals.nextElement();
		}
		return result;
	}
private double getTotalCharge() {
	double result=0;
	Enumeration rentals=_rentals.elements();
	while(rentals.hasMoreElements()) {
		Rental each=(Rental)rentals.nextElement();
		result+=each.getCharge();
	}
	return result;
}
private double amountFor(Rental aRental) {
	return aRental.getCharge();
}
}