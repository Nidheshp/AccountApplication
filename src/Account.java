
public class Account {

	private String firstName;
	private String lastName;
	private int accountNumber;

	public static void main(String[] args) {

		System.out.println(Service.RetrieveFromMap(1));
		System.out.println(Service.RetrieveFromMap(2));
		System.out.println(Service.RetrieveFromMap(3));
	}

	public Account(String firstName, String lastName, int accountNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
