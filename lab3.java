import java.util.Scanner;
public class lab3 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter an alphabet to check whether it's a vowel or not: ");
            String alpha = scan.nextLine();
            if(alpha.equals("a")||alpha.equals("e")||alpha.equals("i")||alpha.equals("o")||alpha.equals("u"))
            {
                System.out.println("\nGiven alphabet \""+alpha+"\" is a vowel.");
            }
            else
            {
                System.out.println("\nGiven alphabet \""+alpha+"\" is a consonant.");
            }
        }
        finally
        {
            scan.close();
        }
    }
}
