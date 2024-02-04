// The Import Statement in Java

public class practicum1 {
  
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.println("What is your name? ");
    String name = input.next();
    System.out.println("Hi " + name);
    input.close();
  }
}
