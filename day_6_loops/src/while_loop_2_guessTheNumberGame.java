import java.util.Scanner;
import java.util.Random;

public class while_loop_2_guessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int correct = rand.nextInt(100) + 1;

        System.out.println("You're going to guess what random number between 1 and 100 (each inclusive) we have!");
        int guess = scan.nextInt();

        while (guess != correct) {
            if (guess > correct) {
                System.out.println("Too high! Try again");
                guess = scan.nextInt();
            } else {
                System.out.println("Too low! Try again");
                guess = scan.nextInt();
            }
        }

        System.out.println("Yes! You guessed right!");
    }
}
