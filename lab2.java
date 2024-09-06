import java.util.Scanner;
public class lab2 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter a number: ");
            int a = scan.nextInt();
            if((a%5)==0)
            {
                System.out.println("\nGiven number is divisible by 5.");
            }
            else if((a%11)==0)
            {
                System.out.println("\nGiven number is divisible by 11.");
            }
            else
            {
                System.out.println("\nGiven number is not divisible by either 5 or 11.");
            }
        }
        finally{ 
            scan.close();
        }
    }
}
