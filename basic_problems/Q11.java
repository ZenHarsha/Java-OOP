// Q11: Final keyword for constant PI
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area: " + (PI * r * r));
        System.out.println("Circumference: " + (2 * PI * r));
    }
}
