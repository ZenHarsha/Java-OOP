public class ToStringExample {
    public static void main(String[] args) {
        double price = 99.95;
        String textPrice = String.valueOf(price);
        System.out.println("Original number: " + price);
        String message = "Final price is INR " + textPrice;
        System.out.println(message);
    }
}