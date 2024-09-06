import java.util.Scanner;
public class lab5 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("Enter a number between 1-7 to find which day of week it is: ");
            int day = scan.nextInt();
            if(day==1)
            {
                System.out.println("\nIt's Monday!");
            }
            else if(day==2)
            {
                System.out.println("\nIt's Tuesday!");
            }
            else if(day==3)
            {
                System.out.println("\nIt's Wednesday!");
            }
            else if(day==4)
            {
                System.out.println("\nIt's Thursday!");
            }
            else if(day==5)
            {
                System.out.println("\nIt's Friday!");
            }
            else if(day==6)
            {
                System.out.println("\nIt's Saturday!");
            }
            else if(day==7)
            {
                System.out.println("\nIt's Sunday!");
            }
            else
            {
                System.out.println("\nEnter a number between 1-7");
            }
        }
        finally
        {
            scan.close();
        }
    }
}
