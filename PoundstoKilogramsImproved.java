// import the Scanner class
import java.util.Scanner;

public class PoundstoKilogramsImproved {
    public static void main(String [ ] args) {
        double pounds;
        double kilograms;
        
        //Scanner object
        Scanner input = new Scanner(System.in);
        String userWeight;

        //Get input from keyboard
        System.out.println("Enter a number in pounds");
        pounds = input.nextDouble();

        // conversion is LBs / 2.205 = KGs
        kilograms = Math.round((pounds / 2.205));
        
        System.out.print(
            pounds + " lbs is about ~ "
            + kilograms + " Kilograms");
        
    }
}
