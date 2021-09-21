import com.npci.bank.AbstractAccountsFactory;
import com.npci.bank.Accounts;
import com.npci.bank.Savings;

public class SavingsFactory extends AbstractAccountsFactory {

	@Override
	public Accounts openAccount(String holder) {
		return new Savings(holder);
	}

}
