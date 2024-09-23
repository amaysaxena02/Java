public class arr1 {
        public static void main(String[] args) {
            String cars[] = {"Volvo","TATA","BMW","Lexus"};
            for(int i = 0; i<=3; i++)
            {
                System.out.println(cars[i]);
            }
            System.out.println(cars.length);
            cars[0]="Honda";
            System.out.println(cars[0]);
        }
}
