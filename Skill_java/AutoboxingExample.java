public class AutoboxingExample {
    public static void main(String[] args) {
        int primitiveNumber = 100;
        Integer wrapperNumber = primitiveNumber;
        System.out.println("Autoboxing to Integer:" + wrapperNumber);
        int newPrimitive = wrapperNumber;
        System.out.println("Unboxing to int:" + newPrimitive);
    }
}