import java.util.Scanner;

public class squareNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a random number");
        double num = scanner.nextDouble();

        double sqnum = num * num;

        System.out.println("The square of this number is " + sqnum);
    }
}
