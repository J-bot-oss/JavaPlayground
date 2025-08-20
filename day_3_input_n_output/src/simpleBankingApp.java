import java.util.Scanner;

public class simpleBankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's simulate a mobile bank together!");

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your starting balance: ");
        double bal = scanner.nextDouble();

        int choice = 0;
        do {
            System.out.println("___Welcome, Cole!___");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.println("Type choice (1,2,3 or 4): ");
            choice = scanner.nextInt();

            if(choice == 1) {
                System.out.println("Enter deposit amount: ");
                double deposit = scanner.nextDouble();
                bal += deposit;
                System.out.println("Deposit successful!");
            } else if (choice == 2) {
                if(bal > 0) {
                    System.out.println("How much do you want to withdraw?: ");
                    double withdraw = scanner.nextDouble();
                    if(withdraw > bal) {
                        System.out.println("You do not have enough!");
                    } else {
                        bal -= withdraw;
                        System.out.println("Withdraw successful!");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Your balance is: " + bal);
            } else if (choice > 4) {
                System.out.println("Invalid choice!");
            }
        } while(choice != 4);
    }
}
