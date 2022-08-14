package src;
import java.util.Scanner;

public class main {
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    double x = input.nextDouble();
    System.out.println("The value of the inputted value you choose is: " + x);
    input.close();
  }
}
