import java.util.Scanner;

class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double taxableIncome = income - 250000; 

        double taxAmount;

        if (taxableIncome <= 0) {
            taxAmount = 0; 
        } else if (taxableIncome <= 250000) {
            taxAmount = 0.1 * taxableIncome; 
        } else if (taxableIncome <= 500000) {
            taxAmount = 0.1 * 250000 + 0.2 * (taxableIncome - 250000);  
        } else if (taxableIncome <= 1000000) {
            taxAmount = 0.1 * 250000 + 0.2 * 250000 + 0.3 * (taxableIncome - 500000); 
        } else {
            taxAmount = 0.1 * 250000 + 0.2 * 250000 + 0.3 * 500000 + 0.3 * (taxableIncome - 1000000); 
        }

        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax Amount: " + taxAmount);

        scanner.close();
    }
}
