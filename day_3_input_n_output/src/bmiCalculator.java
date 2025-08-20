import java.util.Scanner;

public class bmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your weight in kg?: ");
        double weight = scanner.nextDouble();

        System.out.println("What is your height in m?: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height*height);
        String bmi1dp = String.format("%.1f", bmi);

        System.out.println("Your BMI is " + bmi1dp);
        if(bmi < 18.5) {
            System.out.println("Underweight!");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight!");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight!");
        } else {
            System.out.println("Obese!");
        }
    }
}
