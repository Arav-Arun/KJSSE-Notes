public class SizeOf{
    public static void main(String[] args){
        System.out.println("Dtype\t" + "Size in bytes\t"+"Minimum value\t" + "Maximum value\t");

        System.out.println("byte\t" + Byte.BYTES + "\t\t" + Byte.MIN_VALUE+ "\t\t" + Byte.MAX_VALUE);

        System.out.println("char\t" + Character.BYTES + "\t\t" + 
                            (Character.MIN_VALUE + 0) + "\t\t" + 
                            (Character.MAX_VALUE + 0));

        System.out.println("int\t" + Integer.BYTES + "\t\t" + Integer.MIN_VALUE+ "\t" + Integer.MAX_VALUE);

        System.out.println("short\t" + Short.BYTES + "\t\t" + Short.MIN_VALUE+ "\t\t" + Short.MAX_VALUE);

        System.out.println("long\t" + Long.BYTES + "\t\t" + Long.MIN_VALUE+ "\t\t" + Long.MAX_VALUE);

        System.out.println("float\t" + Float.BYTES + "\t\t" + Float.MIN_VALUE+ "\t\t" + Float.MAX_VALUE);
        
        System.out.println("double\t" + Double.BYTES + "\t\t" + Double.MIN_VALUE+ "\t" + Double.MAX_VALUE);
        
    }
}