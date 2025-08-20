import java.util.Scanner;

public class while_loop_3_sumUntilZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("We're going to add every number you input together til you input zero!");

        int num;
        System.out.println("Enter a number: ");
        num = scan.nextInt();

        int sum = 0;
        while (num != 0) {
            sum += num;
            System.out.println("The sum is now " + sum);
            System.out.println("Enter another number: ");
            num = scan.nextInt();
        }

        System.out.println("Final sum is " + sum + "!");
    }
}
