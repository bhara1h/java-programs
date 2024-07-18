import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Register Number: ");
        String registerNumber = scanner.nextLine();

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter your Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter your Test1 Mark: ");
        int test1Mark = scanner.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Register Number: " + registerNumber);
        System.out.println("Name: " + name);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Test1 Mark: " + test1Mark);
    }
}