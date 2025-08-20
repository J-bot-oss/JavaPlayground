import java.util.Scanner;

public class votingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println("You're eligible to vote!");
        } else {
            System.out.println("Jekkkkk!");
        }
    }
}
