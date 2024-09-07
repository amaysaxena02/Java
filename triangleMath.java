import java.util.Scanner;
public class triangleMath {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        try
        {
            System.out.println("This can be done for a right angle triangle.");
            System.out.println("\nEnter the height of triangle: ");
            double x = scan.nextDouble();
            System.out.println("\nEnter the base of triangle: ");
            double y = scan.nextDouble();
            System.out.println("\nHypotenuse of triangle is: "+Math.sqrt((x*x)+(y*y)));
        }
        finally
        {
            scan.close();
        }
    }
}
