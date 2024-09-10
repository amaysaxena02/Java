import java.util.Scanner;
public class conditions {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            int age = scan.nextInt();
            String result = (age < 18) ? "Not old enough to vote" : "Old enough to vote ";
            
            //or we can use
            
            if(age<18)
            {
                System.out.println("\nNot old enough.");
            }
            else
            {
                System.out.println("\nOld enough to vote.");
            }
            System.out.println(result);
        }
        finally
        {
            scan.close();
        }
    }    
}
