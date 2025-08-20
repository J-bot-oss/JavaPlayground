public class celsiusToFahrenheitConverter {
    public static void main(String[] args) {
        double tempCel = 30;
        double tempFahr = (tempCel * (Double.valueOf(9) / Double.valueOf(5))) + 32;
        System.out.println("Given initial temperature as " + tempCel + " degrees Celcius");
        System.out.println("It changes to " + tempFahr + " degrees Fahrenheit");
    }
}
