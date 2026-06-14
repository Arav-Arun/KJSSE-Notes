public class AutomaticConversions {
    public static void main(String[] args) {
        // byte to short
        byte b = 127;
        short s = b; // Valid, byte is smaller than short
        System.out.println("short value: " + s);

        // short to int
        int i = s; // Valid, short is smaller than int
        System.out.println("int value: " + i);

        // int to long
        long l = i; // Valid, int is smaller than long
        System.out.println("long value: " + l);

        // int to float
        float f = i; // Valid, int is smaller than float
        System.out.println("float value: " + f);

        // float to double
        double d = f; // Valid, float is smaller than double
        System.out.println("double value: " + d);
    }
}