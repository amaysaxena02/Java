public class typecasting {
    public static void main(String[] args)
    {
        //WIDENING CASTING
        //this is done automatically
        //byte > short > char > int > long > float > double
        int a = 34;
        long b = a;
        float c = a;
        double d = a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //NARROWING CASTING
        //this is done manually
        //double > float > long > int > char > short > byte
        double myDouble = 34.29292d;
        int myInt = (int) myDouble;
        System.out.println(myDouble);  //output will be 34.29292
        System.out.println(myInt);     //output will be 34
    }
}
