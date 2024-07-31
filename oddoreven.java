import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = scanner.nextInt();

    String result = (number % 2 == ) ? "even" : "odd";
    System.out.println(number + " is " + result + ".");

    scanner.close();
  }
}