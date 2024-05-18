public class Account {

    private int password;
    private String name;
    private double balance;

    public Account(int password, String name, double initialDeposit) {
        this.password = password;
        this.name = name;
        this.balance = initialDeposit;
    }

    public Account(int password, String name) {
        this.password = password;
        this.name = name;
    }

        public int getPassword() {
            return password;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double balance) {
            this.balance += balance;
        }

        public void withdraw(double balance) {
            this.balance -= balance + 5;
        }

        public String toString() {
            return password + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
        }

    }
