class Bharath {
    String name;
    int[] marks;

    Bharath(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    int calculateTotalMarks() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    double calculateGPA() {
        return calculateTotalMarks() / 5.0 / 20;
    }
}

public class BharthTest 
{
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 92, 88};
        Bharath student = new Bharath("ram", marks);
        System.out.println("Total Marks: " + student.calculateTotalMarks());
        System.out.println("GPA: " + student.calculateGPA());
    }
}
