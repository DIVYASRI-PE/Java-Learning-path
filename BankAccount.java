class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(400);
        System.out.println("Final balance: " + account.getBalance());
    }
}