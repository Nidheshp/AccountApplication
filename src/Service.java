import java.util.HashMap;

public class Service {

	HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	private int id = 1;

	public void addAccount(Account Account) {

		accounts.put(id, Account);
		id++;
	}

	public HashMap<Integer, Account> getAccountMap() {

		return accounts;
	}

	public String RetrieveFromMap(int star) {

		return "Account: " + "FirstName " + accounts.get(star).getFirstName() + " LastName "
				+ accounts.get(star).getLastName() + " AccNo " + accounts.get(star).getAccountNumber();
	}

	public int getCountofAccountWithFirstName(String firstName) {
		int count = 0;
		for (Account a : accounts.values()) {
			if (a.getFirstName().equals(firstName)) {
				count++;
			}
		}
		return count;
	}

	public int getCountofAccountWithFirstName8(String firstName) {
		return (int) accounts.values().stream().filter(account -> account.getFirstName().equals(firstName)).count();
	}
}