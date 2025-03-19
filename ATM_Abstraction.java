package Problem_solving;

import java.util.Scanner;

abstract class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double balance);
    abstract void deposit(double balance);
    abstract void checkBal();
}

class ICICI extends ATM {
    ICICI(double balance) {
        super(balance);
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully");
        } else {
            System.out.println("Invalid Amount");
        }
    }

    void checkBal() {
        System.out.println("Available Balance: " + balance);
    }
}

public class ATM_Abstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ICICI obj = new ICICI(1000);

        while (true) {
            System.out.print("""
            ---ATM MENU---
            1. Withdraw Money
            2. Deposit Money
            3. Check Money
            4. Exit
            Enter Your Choice: """);

            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Enter amount to withdraw: ");
                    obj.withdraw(sc.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    obj.deposit(sc.nextDouble());
                }
                case 3 -> obj.checkBal();
                case 4 -> {
                    System.out.println("Thank you for using ICICI ATM");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid Option, Please select a correct option.");
            }
        }
    }
}
