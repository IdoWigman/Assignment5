import java.util.Comparator;

public class TestBalance {
    public static void main(String[] args) {
		// ---------------write your code BELOW this line only! ------------------
        BankAccount BA1 = new BankAccount("Aichael", 1, 750);
        BankAccount BA2 = new BankAccount("BeBron", 2, 1000);
        BankAccount BA3 = new BankAccount("Cobe", 3, 1500);
        BankAccount BA4 = new BankAccount("Dhaq", 4, 4000);
        BankAccount BA5 = new BankAccount("Eeni", 5, 8000);
        Comparator<BankAccount> compByNum = new AccountComparatorByNumber();
        Comparator<BankAccount> compByName = new AccountComparatorByName();
        BankAccountsBinarySearchTree byNumTreeUnbalanced = new BankAccountsBinarySearchTree(compByNum);
        BankAccountsBinarySearchTree byNumTreeBalanced = new BankAccountsBinarySearchTree(compByNum);
        BankAccountsBinarySearchTree byNameTreeUnbalanced = new BankAccountsBinarySearchTree(compByName);
        BankAccountsBinarySearchTree byNameTreeBalanced = new BankAccountsBinarySearchTree(compByName);
        byNumTreeUnbalanced.insert(BA1); byNumTreeUnbalanced.insert(BA2); byNumTreeUnbalanced.insert(BA3); byNumTreeUnbalanced.insert(BA4); byNumTreeUnbalanced.insert(BA5);
        byNumTreeBalanced.insert(BA3); byNumTreeBalanced.insert(BA2); byNumTreeBalanced.insert(BA4); byNumTreeBalanced.insert(BA1); byNumTreeBalanced.insert(BA5);
        byNameTreeBalanced.insert(BA3); byNameTreeBalanced.insert(BA2); byNameTreeBalanced.insert(BA4); byNameTreeBalanced.insert(BA1); byNameTreeBalanced.insert(BA5);
        byNameTreeUnbalanced.insert(BA1); byNameTreeUnbalanced.insert(BA2); byNameTreeUnbalanced.insert(BA3); byNameTreeUnbalanced.insert(BA4); byNameTreeUnbalanced.insert(BA5);
        System.out.println("(name) before balance: " + byNameTreeBalanced.toString().equals(byNameTreeUnbalanced.toString()));
        byNameTreeBalanced.balance(); byNameTreeUnbalanced.balance();
        System.out.println("(name) after balance: " + byNameTreeBalanced.toString().equals(byNameTreeUnbalanced.toString()));
        System.out.println("(number) before balance: " + byNumTreeBalanced.toString().equals(byNumTreeUnbalanced.toString()));
        byNumTreeBalanced.balance(); byNumTreeUnbalanced.balance();
        System.out.println("(number) ater balance: " + byNumTreeBalanced.toString().equals(byNumTreeUnbalanced.toString()));
        // ---------------write your code ABOVE this line only! ------------------
    }


}
