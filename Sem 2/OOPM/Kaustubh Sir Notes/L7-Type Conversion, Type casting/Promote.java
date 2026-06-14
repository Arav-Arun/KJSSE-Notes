public class Promote {
    public static void main(String[] args) {
    byte b = 42;
    float f = 5.67f;
    System.out.println(f * b);

    char c = 'a';
    int i = 50000;
    System.out.println(i / c);
    
    double d = .1234;
    short s = 1024;
    System.out.println(d * s);
    
    double result = (f * b) + (i / c) - (d * s);
    System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
    System.out.println("result = " + result);
    }
   }
