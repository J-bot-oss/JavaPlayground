package Operators;

public class Unary {
    public static void main(String[] args){
        //These are used to perform operations on a single operand.
        // The basic uniary operators in java are +, -, ++, --, and !.

        int a = 5; // positve integer
        int b = -a; // negative integer
        int c = ++a; // pre-increment, incraeses the value of a by 1 before using it
        int d = a++; // post-increment, increases the value of a by 1 after using it
        int e = --a; // pre-decrement, decreases the value of a by 1 before using it
        int f = a--; // post-decremnt, decreases the value of a by 1 after using it
        boolean isTrue = true; // boolean variable
        boolean isFalse = !isTrue; // negation, inverts the value of isTrue

        // To print the results, we use System.out.println()
        System.out.println("a:" +a); // this will print the value of a
        System.out.println("b:" +b); // this will print the value of b
        System.out.println("c:" +c); // this will print the value of c
        System.out.println("d:" +d); // this will print the value of d
        System.out.println("e:" +e); // this will print the value of e
        System.out.println("f:" +f); // this will print the value of f
        System.out.println("isTrue:" +isTrue); // this will print the value of isTrue
        System.out.println("isFalse:" +isFalse); // this will print the value of isFalse

    }
    
}
