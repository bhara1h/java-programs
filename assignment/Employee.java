class Employee {
    private double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary1() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double travelAllowance;
    private double houseRentAllowance;

    public Manager(double baseSalary, double travelAllowance, double houseRentAllowance) {
        super(baseSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    public double getSalary2() {
        return getSalary1() + travelAllowance + houseRentAllowance;
    }
}

public class SalaryDemo {
    public static void main(String[] args) {
        Employee employee = new Employee(50000);
        Manager manager = new Manager(80000, 5000, 7000);

        System.out.println("Employee Salary: " + employee.getSalary1());
        System.out.println("Manager Salary: " + manager.getSalary2());
    }
}
