package Operators;

public class assignment {
    public static void main(String[] args){
        // Assignment operators in Java are used to assign values to variables.
        // The basic assignment operator is '=', but there are also compound assignment operators like '+=', '-=', '*=', '/=', and '%='.
        int a = 10; // Assigns 10 to a
        int b = 5; // Assigns 5 to b

        a += b; // Equivalent to a = a + b now a is 15
        b -= 2; // Equivalent to b = b - 2 now b is 3
        a *= 2; // Equivalent to a = a * 2 now a is 30
        b /= 3; // Equivalent to b = b / 3 now b is 1 (integer division)
        a %= 4; // Equivalent to a = a % 4 now a is 2

        // To print the results, we use System.out.println()
        System.out.println("The value of a after assignment operations is:" + a); // This will print the value of a
        System.out.println("The value of ba after assignment operations is:" + b); // This will print the value of b




    }
    
}
