// Q4: Narrowing conversion
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        int i = (int) d;
        System.out.println("Double: " + d);
        System.out.println("Int (after casting): " + i);
    }
}
