package Abstract_classes;

abstract class Employee {
    protected int employeeId;
    protected double salary;

    public Employee(int employeeId) {
        this.employeeId = employeeId;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}