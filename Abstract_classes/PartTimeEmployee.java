package Abstract_classes;

class PartTimeEmployee extends Employee implements Taxable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(int employeeId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        double gross = hourlyRate * hoursWorked;
        salary = gross - calculateTax();
        return salary;
    }

    @Override
    public double calculateTax() {
        return (hourlyRate * hoursWorked) * 0.1;
    }
}