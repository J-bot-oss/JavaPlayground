import java.util.Scanner;

public class monthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a month number (1-12): ");
        int monthnum = sc.nextInt();

        switch (monthnum) {
            case 1:
                System.out.println("This is January and it has 31 days!");
                break;
            case 2:
                System.out.println("This is February and it has 28 days!");
                break;
            case 3:
                System.out.println("This is March and it has 31 days!");
                break;
            case 4:
                System.out.println("This is April and it has 30 days!");
                break;
            case 5:
                System.out.println("This is May and it has 31 days! (27th is my birthdayyyy!)");
                break;
            case 6:
                System.out.println("This is June and it has 30 days!");
                break;
            case 7:
                System.out.println("This is July and it has 31 days!");
                break;
            case 8:
                System.out.println("This is August and it has 31 days!");
                break;
            case 9:
                System.out.println("This is September and it has 30 days!");
                break;
            case 10:
                System.out.println("This is October and it has 31 days!");
                break;
            case 11:
                System.out.println("This is November and it has 30 days!");
                break;
            case 12:
                System.out.println("This is December and it has 31 days!");
                break;
        }
    }
}
