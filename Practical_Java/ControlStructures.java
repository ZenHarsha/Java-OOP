public class ControlStructures {
    public static void main(String[] args) {
        int temperature = 35;

        if (temperature > 30) {
            System.out.println("It's a hot day!");
        } else {
            System.out.println("It's not a hot day.");
        }
        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}