public class StringImmutability {
    public static void main(String[] args) {
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println(original);
        System.out.println(modified);
    }
}