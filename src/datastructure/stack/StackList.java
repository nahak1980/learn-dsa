package datastructure.stack;

public class StackList {
  private Node top;
  private int height;

  class Node {
    private Node next;
    private int value;
    Node(int value) {
      this.value = value;
    }
  }

  public StackList(int value) {
    Node newNode = new Node(value);
    top = newNode;
    height = 1;
  }

  public void printlist() {
    Node temp = top;
    while(temp != null) {
      System.out.print(temp.value + " ");
      temp = temp.next;
    }
    System.out.println("");
  }

  public void push(int item) {
    Node newNode = new Node(item);
    if(top == null) {
      top = newNode;
    } else {
      newNode.next = top;
      top = newNode;
    }
    height++;
  }

  public Node pop() {
    if(top == null) {
      return null;
    } else {
      Node tempNode = top;
      if(top.next == null) {
        top = null;
        height--;
        return tempNode;
      }
      top = tempNode.next;
      tempNode.next = null;
      height--;
      return tempNode;
    }
  }

  public void getTopValue() {
    System.out.println("The top element is: " + top.value);
  }

  public void printLength() {
    System.out.println("The length of stack is: " + height);
  }

}
