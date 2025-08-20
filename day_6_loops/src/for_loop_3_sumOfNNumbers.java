import java.util.Scanner;

public class for_loop_3_sumOfNNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play a game!");
        System.out.println("Enter any number 'N' and let's get the collective sum of every number from 1 to that" +
                " number, N: ");
        int N = scan.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("1 + 2 + ... + N (when N is " + N + ") = " + sum);
    }
}
