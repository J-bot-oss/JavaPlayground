import java.util.Scanner;

public class do_while_loop_3_repeatUntilValid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double score = 78;

        System.out.println("What do you think you got in the test?: ");
        double guess = scan.nextDouble();

        do {
            System.out.println("Wrong! Guess again");
            guess = scan.nextDouble();

            System.out.println(" ");
        } while (guess != score);

        System.out.println("That's ittttt!");
    }
}
