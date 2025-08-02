public class StringBuilderBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Builder");
        sb.append(" Example");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sf = new StringBuffer("Buffer");
        sf.append(" Example");
        System.out.println("StringBuffer: " + sf);
    }
}