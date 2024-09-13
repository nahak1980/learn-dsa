package datastructure.binarysearchtree;

public class Main {
  public static void main(String[] args) {
    BinarySearchTree myTree = new BinarySearchTree();
    myTree.insertItem(47);
    myTree.insertItem(21);
    myTree.insertItem(76);
    myTree.insertItem(18);
    myTree.insertItem(52);
    myTree.insertItem(82);

    myTree.insertItem(27);
    System.out.println(myTree.root.left.right.value);
    System.out.println(myTree.contains(100));
  }
}
