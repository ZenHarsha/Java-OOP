public class ParsingExample {
    public static void main(String[] args) {
        String textNumber = "500";
        int realNumber = Integer.parseInt(textNumber);
        System.out.println("Original text: " + textNumber);
        System.out.println("Converted number: " + realNumber);
        System.out.println("Output of Math: " + (realNumber / 5));
    }
}