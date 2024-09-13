package datastructure.stack;

public class Main {
  public static void main(String[] args) {
    StackList myList = new StackList(5);
    // myList.push(10);
    // myList.push(15);
    // myList.push(20);
    myList.pop();
    myList.printlist();
    myList.printLength();
    // myList.getTopValue();
  }
}
