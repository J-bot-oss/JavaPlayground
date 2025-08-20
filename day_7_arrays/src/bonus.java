import java.util.Arrays;
import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];
        int score;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter a mark: ");
            score = scan.nextInt();
            marks[i] = score;
        }

        System.out.println("The highest score is " + Arrays.stream(marks).max().getAsInt());
        System.out.println("The lowest score is " + Arrays.stream(marks).min().getAsInt());

        int sum = 0;
        for (int j = 0; j < marks.length; j++) {
            sum += marks[j];
        }
        double ave = Double.valueOf(sum) / Double.valueOf(marks.length);
        System.out.println("The average score is " + ave);
    }
}
