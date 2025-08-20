import java.util.Scanner;

public class do_while_loop_2_menuRepeat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("---Hello---");
            System.out.println("1. What time is it?");
            System.out.println("2. Today is?");
            System.out.println("3. Exit");
            System.out.println(" ");
            System.out.println("Choose (1, 2 or 3): ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("IIIIIIIIIIt's Clobberiinnnnggggg Timmmme!");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Still not Christmas Day! :( ");
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
            }
        } while (choice != 3);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Goodbye!");
    }
}
