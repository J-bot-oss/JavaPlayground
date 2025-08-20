import java.util.Scanner;

public class do_while_loop_1_passwordChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = scan.nextLine();

        do {
            System.out.println("Incorrect password!");
            System.out.println("Try again!");
            password = scan.nextLine();
        } while (!password.equalsIgnoreCase("password"));

        System.out.println("Access Granted!");
    }
}
