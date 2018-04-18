import java.util.HashMap;

public class Service {

	static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public static void addAccount(int star, Account Account) {

		accounts.put(star, Account);

	}

	public static HashMap<Integer, Account> getList() {

		return accounts;
	}

	public static String RetrieveFromMap(int star) {

		return "Account: " + "FirstName " + accounts.get(star).getFirstName() + " LastName "
				+ accounts.get(star).getLastName() + " AccNo " + accounts.get(star).getAccountNumber();
	}

	public static void setaccounts(HashMap<Integer, Account> accounts) {
		Service.accounts = accounts;
	}

}