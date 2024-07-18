import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int height;
        while (true) {
            try {
                height = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer for height: ");
            }
        }

        System.out.print("Enter the base of the triangle: ");
        int base;
        while (true) {
            try {
                base = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid integer for base: ");
            }
        }

        int area = (height * base) / 2;
        System.out.println("Area of the triangle is: " + area);

        sc.close();
    }
}
