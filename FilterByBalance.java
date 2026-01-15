
public class FilterByBalance implements Filter<BankAccount>{

	int balanceThreshold;
	/**
	 * Constructs a FilterByBalance object with the specified balance threshold.
	 *
	 * @param balanceThreshold the balance threshold to filter by.
	 */	
	public FilterByBalance(int balanceThreshold) {
		// ---------------write your code BELOW this line only! ------------------
		this .balanceThreshold = balanceThreshold;
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Determines whether a given bank account meets the balance threshold.
	 *
	 * @param elem the bank account to be evaluated
	 * @return true if the bank account's balance is greater than or equal to the balance threshold, false otherwise
	 */	
	@Override
	public boolean accept(BankAccount element) {
		// ---------------write your code BELOW this line only! ------------------
		return element.getBalance() >= balanceThreshold;
		// ---------------write your code ABOVE this line only! ------------------
	}
}
