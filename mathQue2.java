import java.util.Scanner;
public class mathQue2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter a double: ");
            double x = scan.nextDouble();

            System.out.println("\nWhole part of the double: "+Math.floor(x));
            System.out.println("\nFractional part of the double: "+(x-Math.floor(x)));
        }
        finally
        {
            scan.close();
        }
    }
}
