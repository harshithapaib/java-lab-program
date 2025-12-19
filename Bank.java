import java.util.Scanner;

// Base class
class Account {
    String name;
    int accNo;
    double balance;

    Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposit successful");
    }

    void displayBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

// Savings Account
class SavAcct extends Account {
    double rate = 0.05;

    SavAcct(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    void addInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Current Account
class CurAcct extends Account {
    double minBal = 1000;
    double penalty = 100;

    CurAcct(String name, int accNo, double balance) {
        super(name, accNo, balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            if (balance < minBal) {
                balance -= penalty;
                System.out.println("Minimum balance not maintained");
                System.out.println("Penalty charged: ₹" + penalty);
            }
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

// Main class
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        switch (ch) {
            case 1:
                SavAcct sa = new SavAcct(name, accNo, bal);
                System.out.println("1.Deposit  2.Withdraw  3.Add Interest  4.Display");
                int op1 = sc.nextInt();

                switch (op1) {
                    case 1:
                        System.out.print("Enter amount: ");
                        sa.deposit(sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        sa.withdraw(sc.nextDouble());
                        break;
                    case 3:
                        sa.addInterest();
                        break;
                    case 4:
                        sa.displayBalance();
                        break;
                }
                break;

            case 2:
                CurAcct ca = new CurAcct(name, accNo, bal);
                System.out.println("1.Deposit  2.Withdraw  3.Display");
                int op2 = sc.nextInt();

                switch (op2) {
                    case 1:
                        System.out.print("Enter amount: ");
                        ca.deposit(sc.nextDouble());
                        break;
                    case 2:
                        System.out.print("Enter amount: ");
                        ca.withdraw(sc.nextDouble());
                        break;
                    case 3:
                        ca.displayBalance();
                        break;
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
