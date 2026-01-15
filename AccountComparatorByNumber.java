import java.util.Comparator;

public class AccountComparatorByNumber implements Comparator<BankAccount>{
	/**
	 * Compares two BankAccount objects based on their account numbers.
	 *
	 * @param account1 the first BankAccount to be compared
	 * @param account2 the second BankAccount to be compared
	 * @return a negative integer if account1.accountNumber < account2.accountNumber,
	 * 		   zero if account1.accountNumer== account2.accountNumber, 
	 * 		   a positive integer if account1.accountNumber > account2.accountNumber
	 */

	@Override
	public int compare(BankAccount account1, BankAccount account2) {
		// ---------------write your code BELOW this line only! ------------------
		return account1.getAccountNumber() - account2.getAccountNumber();
		// ---------------write your code ABOVE this line only! ------------------
	}

}
