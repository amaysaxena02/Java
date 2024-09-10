import java.util.Scanner;
public class multiConditions {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        
        System.out.println("\nCalculator: ");
        
        double x = scanner.nextDouble();
        String y = scanner.next();
        double z = scanner.nextDouble();

        switch (y) {
            
            case "+":
                System.out.println("\nResult: "+(x+z));
                break;
                
            case "-":
                System.out.println("\nResult: "+(x-z));
                break;
            case "*":
                System.out.println("\nResult: "+(x*z));
                break;
            case "/":
                System.out.println("\nResult: "+(x/z));
                break;
            case "%":
                System.out.println("\nResult: "+(x%z));
                break;    
        }
      scanner.close();  
    }
}
