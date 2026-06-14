public class IntToByte {
    public static void main(String[] args) {
        int intValue = 123;
        System.out.print("int value: " + intValue);

        byte byteValue;
        //byteValue   = intValue; // Type Mismatch
        byteValue   = (byte) intValue; // Explicit cast

        System.out.println("\tbyte value: " + byteValue);

        // Example of data loss
        intValue = 130;
        byteValue = (byte) intValue;

        System.out.print("int value: " + intValue);
        System.out.println("\tbyte value: " + byteValue);

        // Example of data loss
        intValue = 256;
        byteValue = (byte) intValue;

        System.out.print("int value: " + intValue);
        System.out.println("\tbyte value: " + byteValue);

        // Example of data loss
        intValue = -130;
        byteValue = (byte) intValue;

        System.out.print("int value: " + intValue);
        System.out.println("\tbyte value: " + byteValue);
    }
}
