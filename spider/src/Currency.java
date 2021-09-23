
public interface Currency {

	double dollarValue();
	
	Currency USD = () -> 1.0;
	Currency INR = () -> 73.50;
	Currency AED = () -> 3.75;
	
	static double convert(double amount, Currency source, Currency target) {
		return (target.dollarValue() / source.dollarValue()) * amount;
	}

}
