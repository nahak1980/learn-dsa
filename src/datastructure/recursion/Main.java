package datastructure.recursion;

public class Main {
  public static void main(String[] args) {
    int factorial = fact(8);
    System.out.println("The factorial is: " + factorial);
  }

  public static int fact(int n) {
    if(n == 1) return 1;
    return n * fact(n - 1);
  }

}
