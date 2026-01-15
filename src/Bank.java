public class Bank {

	private BankAccountsBinarySearchTree namesTree;
	private BankAccountsBinarySearchTree accountNumbersTree;
	
	public Bank() {
		namesTree = new BankAccountsBinarySearchTree(new AccountComparatorByName());
		accountNumbersTree = new BankAccountsBinarySearchTree(new AccountComparatorByNumber());
	}

	
	// END OF Given code -----------------------------------
	

	public boolean add(BankAccount newAccount) {
		// ---------------write your code BELOW this line only! ------------------
		if (accountNumbersTree.contains(newAccount)) // no need to check the names tree because if it's in one - it's in both
			return false;
		accountNumbersTree.insert(newAccount);
		namesTree.insert(newAccount);
		return true;
		// ---------------write your code ABOVE this line only! ------------------
	}


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
	
	public boolean depositMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		if ((numberElement == null) || (amount < 0))
			return false;
		return numberElement.depositMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
	}

	public boolean withdrawMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------
		BankAccount numberHolder = new BankAccount("a", accountNumber, 1);
		BankAccount numberElement = accountNumbersTree.findData(numberHolder);
		if ((numberElement == null) || (amount < 0))
			return false;
		return numberElement.withdrawMoney(amount);
		// ---------------write your code ABOVE this line only! ------------------
	}

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
