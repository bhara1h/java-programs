import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double volume = (4. / 3.) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume of the sphere with radius " + radius + " is: " + volume);
    }
}