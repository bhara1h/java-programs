import java.util.Scanner;

public class QuotientAndRemainderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter dividend and divisor: ");
        int dividend = scanner.nextInt();
        int divisor = scanner.nextInt();
        
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        
        scanner.close();
    }
}
