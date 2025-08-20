import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter your third number: ");
        int num3 = scanner.nextInt();

        int largest;

        largest = num1;
        if(num2 > largest) {
            largest = num2;
        }
        if(num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest of those three is " + largest + "!");
    }
}
