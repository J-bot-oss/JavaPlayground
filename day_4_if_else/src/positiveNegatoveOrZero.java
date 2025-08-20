import java.util.Scanner;

public class positiveNegatoveOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = scanner.nextInt();

        if(num > 0) {
            System.out.println("This number is positive!");
        } else if (num == 0) {
            System.out.println("This is zero!");
        } else {
            System.out.println("This number is negative... I'm positive!");
        }
    }
}
