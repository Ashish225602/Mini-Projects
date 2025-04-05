import java.util.*;

class Dcoder {
    static Scanner sc = new Scanner(System.in);
    public static int Balance = 10000;

    public static void main(String args[]) {
        System.out.println("Hello, Bro!");

      //  Dcoder s = new Dcoder();
        showFeatures();
    }

    public static void showFeatures() {
        System.out.println("Welcome to ATM");
        System.out.println("1. Check your balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        System.out.println("0. Exit");

        System.out.print("\nMake your choice: ");
        int choice = sc.nextInt();

        Dcoder.oprations(choice);
    }

    public static void oprations(int choice) {
        switch (choice) {
            case 1:
                showbalanceFunction();
                break;
            case 2:
                withdrawFunction();
                break;
            case 3:
                depositFunction();
                break;
            case 4:
                break;
            default:
                System.out.println("Enter correct option");
        }
    }

    public static void depositFunction() {
        System.out.print("Enter amount you want to deposit: ");
        int amount = sc.nextInt();

        Balance = Balance + amount;
        showbalanceFunction();
    }

    public static void withdrawFunction() {
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        if (amount <= Balance) {
            Balance = Balance - amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }

        showbalanceFunction();
    }

    public static void showbalanceFunction() {
        System.out.println("Your balance is: " + Balance);
        System.out.println("Do you want to add some balance?");
        System.out.println("1. Yes");
        System.out.println("2. No (Exit)");

        int addSomeAmount = sc.nextInt();

        if (addSomeAmount == 1) {
            depositFunction();
        } else {
            System.out.println("Thanks for visiting.");
        }
         showFeatures();
    }
}