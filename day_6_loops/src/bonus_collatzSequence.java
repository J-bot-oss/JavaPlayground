import java.util.Scanner;

public class bonus_collatzSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("The 'Collatz Sequence' works like this: ");
        System.out.println(" -Start with a number n");
        System.out.println(" -If n is even --> divide by 2");
        System.out.println(" -If n is odd --> multiply by 3 and add 1");
        System.out.println("We repeat this til n becomes 1!");
        System.out.println(" ");

        System.out.println("Enter your value of n: ");
        int n = scan.nextInt();

        System.out.println("The Collatz Sequence starting with " + n + " is:");
        System.out.println(n);
        do {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.println(n);
            } else {
                n = (n * 3) + 1;
                System.out.println(n);
            }
        } while (n != 1);

        System.out.println(" ");
        System.out.println("Done!");
    }
}
