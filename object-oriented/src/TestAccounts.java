import com.npci.bank.AccountsFactory;
import com.npci.bank.BalanceException;
import com.npci.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {

		Bank c1 = AccountsFactory.openAccount("Mike", "Current");
		
		
		try {
			c1.withdraw(3000);
			c1.withdraw(5000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Handy for developers to trouble shoot problems
//			System.out.println(e);	// For logging, Handy to audit system behaviour
			System.out.println(e.getMessage());	// For end users
		}
		
		c1.deposit(2000);
		c1.deposit(4000);
		c1.statement();
		
	}
}
