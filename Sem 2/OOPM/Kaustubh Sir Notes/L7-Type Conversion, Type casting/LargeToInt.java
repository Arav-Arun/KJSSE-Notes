public class LargeToInt {
    public static void main(String args[]){
        long longValue = 123;
        System.out.print("long value: " + longValue);

        int intValue;
        //intValue   = longValue; // Type Mismatch
        intValue   = (int) longValue; // Explicit cast

        System.out.println("\tInt value: " + intValue);

        // // Example of data loss
        longValue = 2147483648L;
        System.out.print("long value: " + longValue);
        
        intValue   = (int) longValue; // Explicit cast

        System.out.println("\tInt value: " + intValue);

        // // Example of data loss
        longValue = -2147483649L;
        System.out.print("long value: " + longValue);

        intValue   = (int) longValue; // Explicit cast

        System.out.println("\tInt value: " + intValue);

    }
    
}
