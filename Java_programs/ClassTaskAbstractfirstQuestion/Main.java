
public class Main {
    public static void main(String[] args) {
        Contractor contractor = new Contractor("Tejswini Vasant  Wannewar", 209780.0, 12.0);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Mrunali Arunkumar Pardhi", 251070.0, 12.0);
        System.out.println(" One Month Salary of  Contractor  is : " + contractor.calculateSalary()+"  Rs");
        System.out.println(" One Month Salary Of  Full Time Employee Salary is :  " + fullTimeEmployee.calculateSalary() +"  Rs");
    }
}

