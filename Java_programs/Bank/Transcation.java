package CustomerOfBank;

public class Transcation {

        private double Amount;



        public static double deposite(Customer customer, double amount){
            customer.setBalance(customer.getBalance()+amount);
            return customer.getBalance();
        }
        public static void Withdrowl(Customer customer, double amount){
            customer.setBalance(customer.getBalance()-amount);
//       return customer.getBalance();
        }
    }


