import java.util.Scanner;

public class atmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 4321;

        System.out.println("Please enter PIN!: ");
        int enteredPIN = sc.nextInt();

        if(enteredPIN != correctPin) {
            System.out.println("Access Denied!");
        } else {
            System.out.println("---WELCOME!---");
            System.out.println(" ");
            int choice = 0;
            double bal = 2500000;
            do {
                System.out.println(" ");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.println("Choose between 1 & 4");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: " + bal + "!");
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();
                        bal += deposit;
                        System.out.println("Deposit Successful!");
                        break;
                    case 3:
                        System.out.println("Enter amount you would like to withdraw: ");
                        double withdraw = sc.nextDouble();
                        if(withdraw > bal) {
                            System.out.println("You do not have enough!");
                        } else if (withdraw == bal) {
                            System.out.println("You can't leave a zero-balance!");
                        } else {
                            bal -= withdraw;
                            System.out.println("Withdraw Successful!");
                        }
                        break;
                    case 4:
                        break;
                }
            } while(choice != 4);
        }
    }
}
