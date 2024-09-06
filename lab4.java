import java.util.Scanner;
public class lab4 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter a character: ");
            char input = scan.next().charAt(0);
            if(Character.isUpperCase(input))
            {
                System.out.println("\n\""+input+"\" is an uppercase character.");
            }
            else if(Character.isLowerCase(input))
            {
                System.out.println("\n\""+input+"\" is a lowercase character");
            }
            else
            {
                System.out.println("\n\""+input+"\" is not a letter.");
            }
        }
        finally
        {
            scan.close();
        }
    }
}
