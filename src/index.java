package src;
import java.util.Scanner;
public class index {
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("hi");
    System.out.println("bye");
    System.out.println("");
    System.out.println("What is your name? ");
    String first_name = scanner.nextLine();
    System.out.println("What is your last name's initial? ");
    String last_name = scanner.nextLine();
    System.out.println("Hi " + first_name + " " + last_name + ", welcome to GitHub!");
    scanner.close();
  }
}
