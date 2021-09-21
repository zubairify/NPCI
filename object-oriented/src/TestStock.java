import com.npci.stock.Broker;
import com.npci.stock.Exchange;
import com.npci.stock.Holder;
import com.npci.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.getQuote();
		
		Exchange x = StockSingleton.getStock();
		x.setQuote();
		
		System.out.println(h == b);
		System.out.println(h == x);
	}
}
