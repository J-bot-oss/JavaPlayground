import java.util.Scanner;

public class miniMenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---MENU---");
        System.out.println("1. Say Hello");
        System.out.println("2. Tell a Joke");
        System.out.println("3. Show Date");
        System.out.println("4. Exit");

        int choice;

        do {
            System.out.println("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello, you!");
                    break;
                case 2:
                    System.out.println("Why did the chicken cross 'The Road'?");
                    System.out.println("It was the wrong answer!");
                    break;
                case 3:
                    System.out.println("Today is 20/08/2025!");
                    break;
            }
        } while (choice != 4);
    }
}
