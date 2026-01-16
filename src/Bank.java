/**
 * This class represents a bank management system,
 * it has two bank accounts trees and supports functions like adding or deleting bank accounts
 *
 * @author Ido Wigman
 * @version jdk 21
 */
public class Bank {

	private BankAccountsBinarySearchTree namesTree;
	private BankAccountsBinarySearchTree accountNumbersTree;

	public Bank() {
		namesTree = new BankAccountsBinarySearchTree(new AccountComparatorByName());
		accountNumbersTree = new BankAccountsBinarySearchTree(new AccountComparatorByNumber());
	}

	
	// END OF Given code -----------------------------------

	/**
	 * Adds a new account to the bank
	 *
	 * @param newAccount the account to be added
	 * @return true if 'newAccount' wasn't in the trees before and was added, false otherwise
	 */
	public boolean add(BankAccount newAccount) {
		// ---------------write your code BELOW this line only! ------------------
		if (accountNumbersTree.contains(newAccount)) // no need to check the names tree because if it's in one - it's in both
			return false;
		accountNumbersTree.insert(newAccount);
		namesTree.insert(newAccount);
		return true;
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Deletes an account in the bank with the given name
	 *
	 * @param name the name of the account to be deleted
	 * @return true if there was an account with the required name and the account was deleted successfully, false
	 * otherwise
	 */
	public boolean delete(String name){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount nameHolder = new BankAccount(name, 1, 1);
		BankAccount nameElement = namesTree.findData(nameHolder);
		if (nameElement == null)
			return false;
		namesTree.remove(nameElement);
		accountNumbersTree.remove(nameElement);
		return true;
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Deletes an account in the bank with the given account number
	 * @param accountNumber the account number of the account to be deleted
	 * @return true if there was an account with the required account number and the account was deleted
	 * successfully, false otherwise
	 */
	public boolean delete(int accountNumber){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		if (numberElement == null)
			return false;
		namesTree.remove(numberElement);
		accountNumbersTree.remove(numberElement);
		return true;
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Deposits money into an account
	 *
	 * @param amount the amount to be deposited to an account
	 * @param accountNumber the account number that an account which we want to deposit money into has
	 * @return true if there's an account with the required account number and if 'amount' > 0, false otherwise
	 */
	public boolean depositMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		if ((numberElement == null) || (amount < 0))
			return false;
		return numberElement.depositMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Withdraws money from an account
	 *
	 * @param amount the amount to be withdrawn from an account
	 * @param accountNumber the account number that an account which we want to withdraw money from has
	 * @return true if there's an account with the required account number, if 'amount' > 0 and if the operation was
	 * successful, false otherwise
	 */
	public boolean withdrawMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		if ((numberElement == null) || (amount < 0))
			return false;
		return numberElement.withdrawMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Transfers money from an account to another
	 *
	 * @param amount the amount to be transferred
	 * @param accountNumber1 the account number of the account being withdrawn from
	 * @param accountNumber2 the account number of the account being deposited to
	 * @return true if both account numbers correspond to existing accounts in the bank, if 'amount' > 0 and if the
	 * operation was successful, false otherwise
	 */
	public boolean transferMoney(int amount, int accountNumber1, int accountNumber2) {
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder1 = new BankAccount("a", accountNumber1, 1);
		BankAccount numberElement1 = accountNumbersTree.findData(numberHolder1);
		BankAccount numberHolder2 = new BankAccount("a", accountNumber2, 1);
		BankAccount numberElement2 = accountNumbersTree.findData(numberHolder2);
		if ((numberElement1 == null) || (numberElement2 == null) || (amount < 0) || (!numberElement1.withdrawMoney(amount)))
			return false;
		return numberElement2.depositMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
	}

	/**
	 * Transfers money from an account to another
	 *
	 * @param amount the amount to be transferred
	 * @param accountNumber the account number of the account being withdrawn from
	 * @param name the name of the account being deposited to
	 * @return true if both account number and the name correspond to existing accounts in the bank, if 'amount' > 0
	 * and if the operation was successful, false otherwise
	 */
    public boolean transferMoney(int amount, int accountNumber, String name) {
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		BankAccount nameHolder = new BankAccount(name, 1, 1);
		BankAccount nameElement = namesTree.findData(nameHolder);
		if ((numberElement == null) || (nameElement == null) || (amount < 0) || (!numberElement.withdrawMoney(amount)))
			return false;
		return nameElement.depositMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
    }
}
