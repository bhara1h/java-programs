import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter time period (in years): ");
        double time = scanner.nextDouble();
        
        // Calculate simple interest
        double interest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest: " + interest);
        
        scanner.close();
    }
}
