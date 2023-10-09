import java.util.Scanner;

public class DoctorEarning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEarnings = 0;
        int acceptedPatients = 0;

        while (acceptedPatients < 20) {
            System.out.print("Enter patient's age: ");
            int age = scanner.nextInt();

            // Check if age is valid (between 0 and 120)
            if (age < 0 || age > 120) {
                System.out.println("Invalid age input. Age must be between 0 and 120.");
                continue; // Skip this patient and ask for the next one
            }

            // Determine the fee based on age
            int fee;
            if (age < 17) {
                fee = 300;
            }
            if (age >= 17 && age <= 40) {
                fee = 400;
            }
            if (age > 40) {
                fee = 200;

                totalEarnings += fee;
                acceptedPatients++;

                System.out.println("Fee for this patient: $" + fee);
            }

            System.out.println("Total earnings for the day: $" + totalEarnings);

        }
    }
}
