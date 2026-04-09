package Abstract_classes;

public class Main {
    public static void main(String[] args) {

        FullTimeEmployee emp1 = new FullTimeEmployee(1, 5000);
        PartTimeEmployee emp2 = new PartTimeEmployee(2, 20, 80);

        System.out.println("=== Full Time Employee ===");
        emp1.calculateSalary();
        emp1.displayInfo();

        System.out.println("\n=== Part Time Employee ===");
        emp2.calculateSalary();
        emp2.displayInfo();
    }
}