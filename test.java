public class test {
    public static void main(String args[])
    {
        
        System.out.println("hello");

        String name = "Ashu";
        System.out.println(name);

        int a = 10;
        int b = 15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        float c =  14.67f, d = 17.19f;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c+d);

        if(c+d==31.86f)
        {
            boolean myBool = true;
            System.out.println(myBool);
        }
        else
        {
            boolean myBool = false;
            System.out.println(myBool);
        }

        //area of rect
        int width = 10;
        int length = 13;
        int area;
        area = length*width;
        System.out.println(area);
    }
}