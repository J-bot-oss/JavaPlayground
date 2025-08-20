public class swapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("Before the swap, we have a as " + a + " and b as " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Now, after the swap, we have a as " + a + " and b as " + b);
    }
}
