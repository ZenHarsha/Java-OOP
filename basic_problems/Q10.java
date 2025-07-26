// Q10: Divisibility by 3 and 5
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = (num % 3 == 0) && (num % 5 == 0);
        System.out.println("Divisible by 3 and 5: " + result);
    }
}
