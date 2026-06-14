public class FloatToInt {
    public static void main(String[] args){
        float floatValue = 130.123f;
        System.out.println("float value: " + floatValue);

        byte byteValue   = (byte) floatValue; // Explicit cast

        System.out.println("byte value: " + byteValue);

        int intValue = (int) floatValue;

        System.out.println("int value: " + intValue);

        double doubleValue = 1234567890.123;
        intValue = (int) doubleValue;
        System.out.println("double value: " + doubleValue);
        System.out.println("int value: " + intValue);

        doubleValue = 2147483700.123;
        intValue = (int) doubleValue;
        long longValue = (long) doubleValue;
        System.out.println("double value: " + doubleValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);   

    }
    
}
