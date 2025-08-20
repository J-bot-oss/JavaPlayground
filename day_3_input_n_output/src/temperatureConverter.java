import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.println("Is it in C or F?: ");
        char deg = scanner.next().charAt(0);

        double tempconv;

        if(deg == 'C') {
            tempconv = (temp * (Double.valueOf(9)/Double.valueOf(5))) + 32;
            System.out.println("This temperature is " + tempconv + " degrees in Fahrenheit");
        } else if (deg == 'F') {
            tempconv = (temp - 32) * (Double.valueOf(5)/Double.valueOf(9));
            System.out.println("This temperature is " + tempconv + " degrees in Celsius");
        }
    }
}
