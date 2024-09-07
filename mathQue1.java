import java.util.Scanner;
public class mathQue1{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter first number: ");
            float a = scan.nextFloat();
            
            System.out.println("\nEnter second number: ");
            float b = scan.nextFloat();

            System.out.println("\nRounded off division of given number: "+Math.round((a/b)));
        }
        finally{
            scan.close();
        }
    }
}