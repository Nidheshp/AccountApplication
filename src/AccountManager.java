import com.google.gson.*;

public class AccountManager {

	public static void main(String[] args) {

		Service services = new Service();
		Account Account1 = new Account("Nidhesh", "Pillai", "1001");
		Account Account2 = new Account("Jason", "Hart", "1002");
		Account Account3 = new Account("Callum", "McGregor", "1003");

		services.addAccount(Account1);
		services.addAccount(Account2);
		services.addAccount(Account3);

		System.out.println(services.RetrieveFromMap(1));
		System.out.println(services.RetrieveFromMap(2));
		System.out.println(services.RetrieveFromMap(3));

		JSon gson = new JSon();
		String json = gson.getJSon(services.accounts);
		System.out.println(json);
	}

}
