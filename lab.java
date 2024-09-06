import java.util.Scanner;
public class lab {
    public static void main(String[] args)
    {
        try(Scanner scan = new Scanner(System.in))
        {
         
         System.out.println("Enter a number: ");
         int  a = scan.nextInt() ;
     
         if(a>0)
         {
            System.out.println("\n Number is positive.");
         }
         else if (a<0) {
            System.out.println("\n Number is negative.");
         }
         else
         {
             System.out.println("\n Number is 0.");
         }
        } 
    }
}
