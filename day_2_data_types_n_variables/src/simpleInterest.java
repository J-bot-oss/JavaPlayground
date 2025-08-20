public class simpleInterest {
    public static void main(String[] args) {
        double P = 100000;
        double R = 15;
        double T = 7;
        double interest = (P*R*T) / Double.valueOf(100);
        String interest2dp = String.format("%.2f", interest);
        double finalamount = P + interest;
        String fnlamnt2dp = String.format("%.2f", finalamount);
        System.out.println("A principle of " + P + "ugx facing a rate of " + R + "% p.a gathers an interest of "
                + interest2dp + "ugx after " + T + "years");
        System.out.println("Hence, the final amount will be " + fnlamnt2dp + "ugx");
    }
}
