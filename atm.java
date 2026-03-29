import java.util.Scanner;

public class atm {

    static int balance = 1000;

    // check balance
    static void checkBalance() {
        System.out.println("Balance = " + balance);
    }

    // deposit money
    static void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw money
    static void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, amt;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amt = sc.nextInt();
                    deposit(amt);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    amt = sc.nextInt();
                    withdraw(amt);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}