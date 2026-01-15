
public class FilterByAccountNumber implements Filter<BankAccount> {

    int minAccountNumber;
    int maxAccountNumber;
    /**
     * Constructs a FilterByAccountNumber object with the specified minimum and maximum account numbers.
     *
     * @param minAccountNum the minimum account number to filter by
     * @param maxAccountNum the maximum account number to filter by
     */  
    public FilterByAccountNumber(int minAccountNum, int maxAccountNum) {
		// ---------------write your code BELOW this line only! ------------------
        this.minAccountNumber = minAccountNum;
        this.maxAccountNumber = maxAccountNum;
		// ---------------write your code ABOVE this line only! ------------------
    }

    /**
     * Determines whether a given BankAccount element should be accepted based on its account number.
     * 
     * @param element the BankAccount element to be checked
     * @return true if the account number of the element is within the specified range (inclusive), false otherwise
     */
    public boolean accept(BankAccount element) {
		// ---------------write your code BELOW this line only! ------------------
        return  element.getAccountNumber() >= minAccountNumber && element.getAccountNumber() <= maxAccountNumber;
		// ---------------write your code ABOVE this line only! ------------------
    }
}
