import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    double getBalance();
}

class Savings implements Account {
    private double balance;
    private double interestRate;

    public Savings(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    public void applyInterest() {
        balance += calculateInterest();
    }
}

class Current implements Account {
    private double balance;

    public Current(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0.0; // Current accounts do not earn interest
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void issueCheck(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Check issued for $" + amount);
        } else {
            System.out.println("Insufficient balance to issue the check.");
        }
    }
}

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

public class bank_main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account savingsAccount = new Savings(1000.0, 0.05);
        Account currentAccount = new Current(2000.0);

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        for (Account account : bank.getAccounts()) {
            System.out.println("Account Balance: " + account.getBalance());
            account.deposit(500.0);
            account.withdraw(200.0);
            System.out.println("Interest Earned: $" + account.calculateInterest());
            System.out.println("Updated Balance: $" + account.getBalance());
            System.out.println();

            if (account instanceof Savings) {
                Savings savings = (Savings) account;
                savings.applyInterest();
                System.out.println("Applied Interest. Updated Balance: $" + savings.getBalance());
            } else if (account instanceof Current) {
                Current current = (Current) account;
                current.issueCheck(300.0);
                System.out.println("Issued Check. Updated Balance: $" + current.getBalance());
            }

            System.out.println();
        }
    }
}
