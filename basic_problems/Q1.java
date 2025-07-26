// Q1: Primitive data types and their sizes using wrappers
public class Q1 {
    public static void main(String[] args) {
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 12.34f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte: " + b + ", Size: " + Byte.BYTES + " bytes");
        System.out.println("Short: " + s + ", Size: " + Short.BYTES + " bytes");
        System.out.println("Int: " + i + ", Size: " + Integer.BYTES + " bytes");
        System.out.println("Long: " + l + ", Size: " + Long.BYTES + " bytes");
        System.out.println("Float: " + f + ", Size: " + Float.BYTES + " bytes");
        System.out.println("Double: " + d + ", Size: " + Double.BYTES + " bytes");
        System.out.println("Char: " + c + ", Size: " + Character.BYTES + " bytes");
        System.out.println("Boolean: " + bool + ", Size: JVM dependent");
    }
}
