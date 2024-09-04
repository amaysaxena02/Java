public class numbers {
    public static void main(String[] args)
    {
        byte a = 100; //range is -128 to 127
        short b = 5000; //range is -32768 to 32767
        int c = 100000; //range is -2147483648 to 2147483647
        long d = 2000000l; //range is really big
        float e = 28.768f; 
        double f = 2873.378393d; 


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}