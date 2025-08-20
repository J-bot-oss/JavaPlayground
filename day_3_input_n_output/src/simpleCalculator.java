import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter your second number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        System.out.println("Their sum is: " + sum);
        System.out.println("Their difference is: " + diff);
        System.out.println("Their product is: " + prod);
        if(num2 != 0) {
            double quot = num1 / num2;
            System.out.println("Their quotient is: " + quot);
        } else {
            System.out.println("We don't divide by zero!");
        }
    }
}
