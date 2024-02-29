package CSW2ASS1.Q7;
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void setBalance(double balance){
        this.balance=balance;
    }
    double getBalance(){
        return balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public int getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    private double interestRate;
    private double balance=getBalance();

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * (interestRate / 100);
        balance += (amount + interest);
        setBalance(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            setBalance(balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;
    private double balance=getBalance();

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        setBalance(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            setBalance(balance);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
}



// BankingApplication.java
public class BankingApplication {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount(1001, 5000.0, 3.5);
        CurrentAccount currentAccount = new CurrentAccount(2001, 10000.0, 2000.0);

        savingsAccount.deposit(2000.0);
        savingsAccount.withdraw(1000.0);

        currentAccount.deposit(3000.0);
        currentAccount.withdraw(15000.0); // Exceeds overdraft limit

        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: $" + savingsAccount.getBalance());

        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: $" + currentAccount.getBalance());
    }
}

/*
    output
        Savings Account Details:
        Account Number: 1001
        Balance: $6070.0

        Current Account Details:
        Account Number: 2001
        Balance: $-2000.0
 */
