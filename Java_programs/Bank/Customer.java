package CustomerOfBank;


    public class Customer {
        private long AccountNumber;
        private String Name;
        private double Balance;

        public long getAccountNumber() {
            return AccountNumber;
        }

        public void setAccountNumber(long accountNumber) {
            AccountNumber = accountNumber;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public double getBalance() {
            return Balance;
        }

        public void setBalance(double balance) {
            Balance = balance;
        }



        void DisplayDetails(){


            System.out.println(getAccountNumber());
            System.out.println(getName());
            System.out.println(getBalance());
        }
    }


