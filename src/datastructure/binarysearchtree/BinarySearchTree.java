package datastructure.binarysearchtree;

public class BinarySearchTree {

  Node root;

  class Node {
    Node left;
    Node right;
    int value;
    private Node(int val) {
      this.value = val;
    }
  }

  public boolean insertItem(int val) {
    Node newNode = new Node(val);
    if(root == null) {
      root = newNode;
      return true;
    } 
    Node temp = root;
    while(true) {
      if(temp.value == newNode.value) {
        return false;
      } 
      if(val < temp.value) {
        if(temp.left == null) {
          temp.left = newNode;
          return true;
        }
        temp = temp.left;
      } else {
        if(temp.right == null) {
          temp.right = newNode;
          return true;
        }
        temp = temp.right;
      }
    }
  }

  public boolean contains(int item) {
    if(root == null) {
      return false;
    }
    Node temp = root;
    while(temp != null) {
      if(item < temp.value) {
        temp = temp.left;
      } else if(item > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }
  
}
