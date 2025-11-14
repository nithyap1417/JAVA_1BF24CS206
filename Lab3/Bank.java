class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    Account(String name, int accNo, String type, double bal) {
        customerName = name;
        accountNumber = accNo;
        accountType = type;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        displayBalance();
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        displayBalance();
    }
}

class Sav_acct extends Account {
    double interestRate = 5.0; // 5% interest per year

    Sav_acct(String name, int accNo, double bal) {
        super(name, accNo, "Savings", bal);
    }

    void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest deposited: " + interest);
        displayBalance();
    }
}

class Cur_acct extends Account {
    double minBalance = 1000;
    double serviceCharge = 100;

    Cur_acct(String name, int accNo, double bal) {
        super(name, accNo, "Current", bal);
    }

    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            checkMinimumBalance();
        } else {
            System.out.println("Insufficient balance!");
        }
        displayBalance();
    }

    void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum. Service charge imposed: " + serviceCharge);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        System.out.println("---- Savings Account ----");
        Sav_acct s1 = new Sav_acct("Rakshita", 1001, 5000);
        s1.displayBalance();
        s1.deposit(2000);
        s1.computeAndDepositInterest();
        s1.withdraw(1500);

        System.out.println("\n---- Current Account ----");
        Cur_acct c1 = new Cur_acct("Rakshita", 2001, 1500);
        c1.displayBalance();
        c1.withdraw(600);
        c1.deposit(500);
    }
}
