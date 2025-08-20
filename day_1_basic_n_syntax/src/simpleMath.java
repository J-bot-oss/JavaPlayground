public class simpleMath {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = Double.valueOf(num1) / Double.valueOf(num2);
        System.out.println("We have two numbers; " + num1 + " and " + num2);
        System.out.println("Their sum is " + sum);
        System.out.println("Their difference is " + difference);
        System.out.println("Their product is " + product);
        System.out.println("And their quotient is " + quotient);
    }
}
