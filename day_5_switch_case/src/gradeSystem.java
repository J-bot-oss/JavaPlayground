import java.util.Scanner;

public class gradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your mark: ");
        double mark = sc.nextDouble();

        int grdpos;

        if(mark >= 80) {
            grdpos = 1;
        } else if (mark >= 70) {
            grdpos = 2;
        } else if (mark >= 60) {
            grdpos = 3;
        } else if (mark >= 50) {
            grdpos = 4;
        } else {
            grdpos = 5;
        }

        String grade = "";

        switch(grdpos) {
            case 1:
                grade = "A";
                break;
            case 2:
                grade = "B";
                break;
            case 3:
                grade = "C";
                break;
            case 4:
                grade = "D";
                break;
            case 5:
                grade = "F";
                break;
        }

        System.out.println("You have " + mark + "% and hence are in grade " + grade + "!");
    }
}
