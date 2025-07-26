// Q12: Attempt to modify final variable
public class Q12 {
    public static void main(String[] args) {
        final int value = 10;
        // value = 20; // Uncommenting this will cause a compile-time error
        System.out.println("Final value: " + value);
    }
}
