import java.util.Scanner;

public class for_loop_4_factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number and let's find it's factorial: ");
        int num = scan.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
             factorial = factorial * i;
        }

        System.out.println(num + "! = " + factorial);
    }
}
