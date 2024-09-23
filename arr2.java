public class arr2 {
    public static void main(String[] args) {
        String[] cars = {"BMW","Honda","Volvo","Audi"};
        //for loop method
        for(int i = 0; i<=3; i++){
            System.out.println(cars[i]);
        }

        //for-each method, this does the same job as for loop method but its easier to write and more readable
        for(String i: cars){
            System.out.println(i);
        }
    }
}
