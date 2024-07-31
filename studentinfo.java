import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Register Number: ");
        String registerNumber = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        System.out.print("Enter Test1 Mark: ");
		double test1Mark = Double.parseDouble(scanner.nextLine());

		System.out.println("\nStudent Details:");
		System.out.println("Register Number: " + registerNumber);
		System.out.println("Name: " + name);
		System.out.println("Course Code: " + courseCode);
		System.out.println("Course Name: " + courseName);
		System.out.println("Test1 Mark: " + test1Mark);

    }
}