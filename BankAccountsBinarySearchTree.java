
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class BankAccountsBinarySearchTree extends BinarySearchTree<BankAccount>{

	public BankAccountsBinarySearchTree(Comparator<BankAccount> treeComparator) {
		super(treeComparator);
	}

	/**
	 * Balances the binary search tree by first collecting all bank accounts
	 * into a list, then rebuilding the tree to be balanced.
	 * 
	 * This method performs the following steps:
	 * 1. Collects all bank accounts in the tree into a list.
	 * 2. Sets the root of the tree to null.
	 * 3. Rebuilds the tree using the collected list to ensure it is balanced.
	 */
	public void balance(){
		// ---------------write your code BELOW this line only! ------------------
		Iterator <BankAccount> iter = iterator();
		List<BankAccount> bankAccounts = new DynamicArray<>();
		while (iter.hasNext()) {
			bankAccounts.add(iter.next());
		}
		root = null;
		buildBalancedTree(bankAccounts, 0, bankAccounts.size() - 1);
		// ---------------write your code ABOVE this line only! ------------------
	}
	    
	private void buildBalancedTree(List<BankAccount> list, int low, int high) {
		// ---------------write your code BELOW this line only! ------------------
		if (low <= high) {
			int mid = (low + high) / 2;
			insert(list.get(mid));
			buildBalancedTree(list, low, mid - 1);
			buildBalancedTree(list, mid + 1, high);
		}
		// ---------------write your code ABOVE this line only! ------------------
	}
}
