import java.util.Scanner;

public class Polar {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Test Data");
        System.out.println("Enter a number:");
        int posNeg = sc.nextInt();
        if (posNeg >= 0) {
            System.out.println(posNeg + " is positive");

        } else {
            System.out.println (posNeg + " is Negative " );


        }

}
}
