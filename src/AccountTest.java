import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	Service service = new Service();
	Account Account1 = new Account("Nidhesh", "Pillai", 1001);
	Account Account2 = new Account("Jason", "Hart", 1002);
	Account Account3 = new Account("Callum", "McGregor", 1003);

	@Test
	public void addAccount() {

		Service.addAccount(1, Account1);
		Service.addAccount(2, Account2);
		Service.addAccount(3, Account3);

		assertSame("Actual not Expected", Account1, Service.accounts.get(1));
	}

}
