import java.util.Scanner;

public class khushi {
    public static void main(String[] args) {
        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            System.out.println("Enter value of a: ");
            int a = scan.nextInt();
            System.out.println("Enter value of b: ");
            int b = scan.nextInt();

            System.out.println("\nSum of a and b: " + (a + b));
        } finally {
            if (scan != null) {
                scan.close(); // Ensure the Scanner is closed
            }
        }
    }
}