class BankAccount {
    String accountHolderName;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance! Cannot withdraw.");
        }
    }
    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

