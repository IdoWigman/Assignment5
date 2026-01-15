import java.util.ArrayList;

/**
     * Filters and retrieves all valid bank accounts based on the criteria:
     * 1. account.balance >= requiredBalance
     * 2. minAccountNumber <= account.accountNumber <= maxAccountNumber
     *
     * @param accounts An iterable collection of bank accounts to be filtered.
     * @param requiredBalance The minimum required balance for an account to be considered valid.
     * @param minAccountNumber The minimum account number for an account to be considered valid.
     * @param maxAccountNumber The maximum account number for an account to be considered valid.
     * @return A list of bank accounts that meet the specified criteria.
     */
public class BankAccountFiltering {
    public static List<BankAccount> getAllValidAccounts(Iterable<BankAccount> accounts, 
                                                        int requiredBalance, 
                                                        int minAccountNumber, 
                                                        int maxAccountNumber) {
		// ---------------write your code BELOW this line only! ------------------
        Filter<BankAccount> filterByReqBalance = new FilterByBalance(requiredBalance);
        Filter<BankAccount> filterByAccNum =  new FilterByAccountNumber(minAccountNumber, maxAccountNumber);
        List<Filter<BankAccount>> filters = new LinkedList<>();
        filters.add(filterByReqBalance);
        filters.add(filterByAccNum);
        FilterIterator<BankAccount> filterIter = new FilterIterator<>(accounts, filters);
        List<BankAccount> filteredAccounts = new LinkedList<>();
        while (filterIter.hasNext()) {
            filteredAccounts.add(filterIter.next());
        }
        return filteredAccounts;
		// ---------------write your code ABOVE this line only! ------------------
    }
}
