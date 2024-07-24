import java.util.Scanner;

class Triangle {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        Triangle triangle = new Triangle(base, height);
        double area = triangle.calculateArea();
        System.out.println("The area of the triangle is: " + area);

        scanner.close();
    }
}