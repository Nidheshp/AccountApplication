import static org.junit.Assert.*;
import java.util.HashMap;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

	Service service = new Service();

	Account Account1 = new Account("Nidhesh", "Pillai", "1001");
	Account Account2 = new Account("Jason", "Hart", "1002");
	Account Account3 = new Account("Callum", "McGregor", "1003");

	@Test
	public void addAccountTest() {
		service.addAccount(Account1);
		Assert.assertEquals(service.getAccountMap().size(), 1);
		service.addAccount(Account2);
		Assert.assertEquals(service.getAccountMap().size(), 2);
		service.addAccount(Account3);
		Assert.assertEquals(service.getAccountMap().size(), 3);

	}

	@Test
	public void jSonTest() {
		
		Account test1 = new Account("Nidhesh", "Pillai", "1001");
		service.addAccount(test1);
		String output = "{\"1\":{\"firstName\":\"Nidhesh\",\"lastName\":\"Pillai\",\"accountNumber\":\"1001\"}}";
		JSon gson = new JSon();
		String jsonTest = gson.getJSon(service.getAccountMap());
		assertEquals(jsonTest, output);
	}
}
