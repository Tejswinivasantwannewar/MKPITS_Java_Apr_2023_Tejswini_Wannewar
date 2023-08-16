
      package CustomerOfBank;

        public class Main {

            public static void main(String []args){
                System.out.println("Bank Of Baroda");
                Customer customer = new Customer();
                customer.setAccountNumber(1001345765);
                customer.setName("Tejswini Wannewar");
                customer.setBalance(5000);
                Transcation transation = new Transcation();
                transation.deposite(customer,5000);

                customer.DisplayDetails();



            }

        }

