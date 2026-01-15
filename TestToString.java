public class TestToString {
    public static void main(String[] args) {
		// ---------------write your code BELOW this line only! ------------------
        BinaryTree BT = new BinaryTree<Integer>();
        boolean emptyTest = BT.toString().equals("Empty Tree");
        BT.insert(1);
        boolean onlyRootTest = BT.toString().equals("tree(1)");
        BT.insert(2); // inserted randomly in 'left' or 'right' so we'll check multiple times
        boolean rootAndElementTest = true;
        for (int i = 0; (i < 10) && (rootAndElementTest); i++) {
            rootAndElementTest = (BT.toString().equals("tree((2),1)")) || BT.toString().equals("tree(1,(2))");
        }
        System.out.println("Status of and empty root case: " + emptyTest);
        System.out.println("Status of root only case: " + onlyRootTest);
        System.out.println("Status of root and and element case: " + rootAndElementTest);
		// ---------------write your code ABOVE this line only! ------------------
    }
}
