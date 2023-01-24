public class PoundstoKilograms {
    public static void main(String [ ] args) {
        int pounds;
        double kilograms;
        
        pounds = 130;

        // conversion is LBs / 2.205 = KGs
        kilograms = (pounds / 2.205);
        
        System.out.print(
            pounds + "lbs in pounds is "
            + kilograms + "kgs in Kilograms");
        
    }
}
