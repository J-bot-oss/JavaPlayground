public class circleMath {
    public static void main(String[] args) {
        double radius = 7.5;
        double pi = Double.valueOf(22)/Double.valueOf(7);
        double area = pi * radius * radius;
        String formattedArea = String.format("%.2f", area);
        double circumference = 2 * pi * radius;
        String formattedCircumference = String.format("%.2f", circumference);
        System.out.println("Given a circle of radius " + radius + "cm;");
        System.out.println("Its area is: " + formattedArea + "sqcm... (2dp)");
        System.out.println("And its circumference is: " + formattedCircumference + "cm... (2dp)");
    }
}
