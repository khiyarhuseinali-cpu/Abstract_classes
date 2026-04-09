package Abstract_classes;

class FullTimeEmployee extends Employee implements Taxable, BonusEligible {
    private double baseSalary;

    public FullTimeEmployee(int employeeId, double baseSalary) {
        super(employeeId);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        salary = baseSalary + calculateBonus() - calculateTax();
        return salary;
    }

    @Override
    public double calculateTax() {
        return baseSalary * 0.2; // 20% tax
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.1; // 10% bonus
    }
}