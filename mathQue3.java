import java.util.Scanner;
public class mathQue3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try 
        {
            System.out.println("Enter a double: ");
            double x = scan.nextDouble();
            if(x==Math.floor(x))
            {
                System.out.println("\n"+x+" is an integer.");
            }
            else
            {
                System.out.println("\n"+x+" is not an integer.");
            }
        }
        finally
        {
            scan.close();
        }
    }
}
