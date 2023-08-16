

abstract public class Employee {
    String name;
    double paymentPerHour;

    public Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    public abstract double calculateSalary();
}
