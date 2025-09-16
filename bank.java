import java.util.Scanner;
class bank {
    private double balance; 
    public BankAccount(double initialBalance) 
    {
        balance = initialBalance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } 
        else 
        {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0)
           {
            if (amount <= balance)
           {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } 
        else 
        {
               System.out.println("Insufficient balance.");
        }
        } 
        else 
        {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public double getBalance() 
    {
        return balance;
    }
}
public class BankSystem 
{
    public static void main(String[] args) 
    {
        BankAccount account = new BankAccount(1000); 

        account.deposit(1000);
        account.withdraw(700);
        account.withdraw(1500); 
        System.out.println("Current Balance: " + account.getBalance());
    }
}
