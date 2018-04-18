
public class AccountManager {

	public static void main(String[] args) {

		Account Account1 = new Account("Nidhesh", "Pillai", 1001);
		Account Account2 = new Account("Jason", "Hart", 1002);
		Account Account3 = new Account("Callum", "McGregor", 1003);

		Service.addAccount(1, Account1);
		Service.addAccount(2, Account2);
		Service.addAccount(3, Account3);

		System.out.println(Service.RetrieveFromMap(1));
		System.out.println(Service.RetrieveFromMap(2));
		System.out.println(Service.RetrieveFromMap(3));
	}

}
