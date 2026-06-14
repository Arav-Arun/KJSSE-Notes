public class TruncationExample {
    public static void main(String[] args) {
        double floatingPointValue = 300.123;
        int integerValue = (int) floatingPointValue;
        byte byteValue = (byte) floatingPointValue;

        System.out.println("Floating-point value: " + floatingPointValue);
        System.out.println("Integer value after truncation: " + integerValue);
        System.out.println("Byte value after truncation: " + byteValue);
    }
}