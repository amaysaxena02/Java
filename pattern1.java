public class pattern1 {
    public static void main(String[] args) {
    int rows = 6;
    for(int i = 0; i<=rows; i++)
    {
        for(int j=2*(rows-i); j>=0 ; j--)
        {
            System.out.print(" ");
        }
        for(int k=0; k<=i; k++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
