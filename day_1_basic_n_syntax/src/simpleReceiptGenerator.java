public class simpleReceiptGenerator {
    public static void main(String[] args) {
        String item = "Bread";
        double price = 2500;
        double quantity = 3;
        double tax = (price * quantity) * (Double.valueOf(5) / Double.valueOf(100));
        double total = (price * quantity) + tax;
        System.out.println("___RECEIPT___");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + price + "ugx");
        System.out.println("Tax: 5%");
        System.out.println("Total: " + total + "ugx");
    }
}
