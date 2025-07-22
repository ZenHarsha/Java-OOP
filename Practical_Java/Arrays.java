public class Arrays {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("The first fruit is: " + fruits[0]);
        System.out.println("\nList of all fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}