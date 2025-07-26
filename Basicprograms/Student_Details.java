import java.util.Scanner;

public class Student_Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Num: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter CGPA: ");
        int cgps = scanner.nextInt();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("CGPA: " + cgps);

        scanner.close();
    }
}