import java.util.Scanner;

public class for_loop_2_multiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What multiplication table do you want? (1-12): ");
        int num = scan.nextInt();

        int prod;

        for (int i=1; i <= 12; i++) {
            prod = i * num;
            System.out.println(i + " x " + num + " = " + prod);
        }
    }
}
