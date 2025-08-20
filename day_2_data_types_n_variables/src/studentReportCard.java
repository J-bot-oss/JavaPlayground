public class studentReportCard {
    public static void main(String[] args) {
        String name = "Cole";
        double physics = 78.5;
        double chemistry = 66.0;
        double mathematics = 89.5;
        double total = physics + chemistry + mathematics;
        double average = total / 3;
        String avg2dp = String.format("%.2f", average);
        boolean hasPassed;

        if(average >= 50) {
            hasPassed = true;
        } else {
            hasPassed = false;
        }

        System.out.println("___REPORT CARD___");
        System.out.println("Name: " + name);
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Mathematics: " + mathematics);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg2dp + "(2dp)");
        System.out.println("Passed: " + hasPassed);
    }
}
