public class FullTimeEmployee extends Employee{

    double workingHours;

    public FullTimeEmployee(String name, double paymentPerHour, double workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        if (workingHours <= 40) {
            return paymentPerHour * workingHours;
        } else {
            double overtimeHours = workingHours - 40;
            double regularSalary = paymentPerHour * 40;
            double overtimeSalary = overtimeHours * (paymentPerHour * 1.5);
            return regularSalary + overtimeSalary;
        }
    }
}
