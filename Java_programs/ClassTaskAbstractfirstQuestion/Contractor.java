public class Contractor extends Employee{

    double workingHours;

    public Contractor(String name, double paymentPerHour, double workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
