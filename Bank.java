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

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}


	public boolean delete(String name){
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}
	
	public boolean delete(int accountNumber){
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}
	
	public boolean depositMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}

	public boolean withdrawMoney(int amount, int accountNumber){
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}

	public boolean transferMoney(int amount, int accountNumber1, int accountNumber2) {
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
	}
   
    public boolean transferMoney(int amount, int accountNumber, String name) {
		// ---------------write your code BELOW this line only! ------------------

		throw new UnsupportedOperationException("Remove this line");
		
		// ---------------write your code ABOVE this line only! ------------------
    }
}
