import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter a string: ");
        String inputString = scanner.next(); // Reads a single word

        // Alternatively, use scanner.nextLine() to read the entire line:
        // String inputString = scanner.nextLine();

        System.out.println("You entered: " + num + " and " + inputString);
    }
}
