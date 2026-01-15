import java.util.Comparator;

public class AccountComparatorByName implements Comparator<BankAccount>{
	/**
	 * Compares two BankAccount objects by their names in a lexigraphic order.
	 *
	 * @param account1 the first BankAccount to be compared
	 * @param account2 the second BankAccount to be compared
	 * @return a negative integer, if account1.name< account2.name
	 * 		   zero if account1.name==account2.name,
	 * 		   a positive integer if account1.name> account2.name
	 */

	@Override
	public int compare(BankAccount account1, BankAccount account2) {
		// ---------------write your code BELOW this line only! ------------------
		String acc1Name = account1.getName();
		String acc2Name = account2.getName();
		for (int i = 0; i < acc1Name.length(); i++) {
			if (i == acc2Name.length() || (int) acc1Name.charAt(i) > (int) acc2Name.charAt(i))
				return 1;
			if ((int) acc1Name.charAt(i) < (int) acc2Name.charAt(i))
				return -1;
		}
		return acc1Name.length() - acc2Name.length(); // acc2Name's length is >= to acc1Name's length
		// ---------------write your code ABOVE this line only! ------------------

	}

}
        

        