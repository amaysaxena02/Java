public class Strings {
    public static void main(String[] args)
    {
        String txt = "ABCDefghIJKLMnopQRSTUVwxYZ";
        System.out.println(txt);
        System.out.println("The length of the txt string is: " +txt.length());
        System.out.println("All in uppercase: " +txt.toUpperCase());
        System.out.println("All in lowercase:   " +txt.toLowerCase());
        System.out.println(txt.indexOf("C"));

        String locate = "Please locate where 'locate' occurs!";
        System.out.println(locate.indexOf("locate"));


        //CONCATENATION
        String firstName = "Amay";
        String lastName = "Saxena";
        System.out.println(firstName+lastName); //method #1
        System.out.println(firstName.concat(lastName));  //method #2

        int a = 10;
        int b = 20;
        int c =a+b;
        System.out.println(c);
        
        String x = "10";
        String y = "20";
        String z = x+y;
        System.out.println(z);
        
        int t = 10;
        String u = "20";
        String v = t+u;
        System.out.println(v);

    }
}
