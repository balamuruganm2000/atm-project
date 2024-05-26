package atm;

import java.util.Scanner;

public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM(1000); // Initial balance

        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    atm.deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    atm.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}