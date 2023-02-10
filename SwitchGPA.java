import java.util.Scanner;

public class SwitchGPA {
    public static void main(String [ ] args) {
       //Scanner object
       Scanner input = new Scanner(System.in);
        
       
       //Get input from keyboard
       System.out.print("Enter a grade point average from 4.0 to 0.0: ");
       
       String GPA = input.nextLine();
       input.close();

        // conversion of GPA to percentage range

        switch (GPA) {
            case "4.0":
            System.out.print(GPA + " GPA is a 100% to 95%");
                break;

            case "3.9":
            System.out.print(GPA + " GPA is a 95% to 94%");
                break;

            case "3.8":
            System.out.print(GPA + " GPA is a 94% to 93%");
                break;

            case "3.7":
            System.out.print(GPA + " GPA is a 93% to 92%");
                break;

            case "3.6":
            System.out.print(GPA + " GPA is a 92% to 91%");
                break;

            case "3.5":
            System.out.print(GPA + " GPA is a 91% to 90%");
                break;
            
            case "3.4":
            System.out.print(GPA + " GPA is a 90% to 89%");
                break;

            case "3.3":
            System.out.print(GPA + " GPA is a 89% to 88%");
                break;

            case "3.2":
            System.out.print(GPA + " GPA is a 88% to 87%");
                break;

            case "3.1":
            System.out.print(GPA + " GPA is a 87% to 86%");
                break;

            case "3.0":
            System.out.print(GPA + " GPA is a 86% to 85%");
                break;

            case "2.9":
            System.out.print(GPA + " GPA is a 85% to 84%");
                break;

            case "2.8":
            System.out.print(GPA + " GPA is a 84% to 83%");
                break;

            case "2.7":
            System.out.print(GPA + " GPA is a 83% to 82%");
                break;

            case "2.6":
            System.out.print(GPA + " GPA is a 82% to 81%");
                break;

            case "2.5":
            System.out.print(GPA + " GPA is a 81% to 80%");
                break;

            case "2.4":
            System.out.print(GPA + " GPA is a 80% to 79%");
                break;

            case "2.3":
            System.out.print(GPA + " GPA is a 79% to 78%");
                break;

            case "2.2":
            System.out.print(GPA + " GPA is a 78% to 77%");
                break;

            case "2.1":
            System.out.print(GPA + " GPA is a 77% to 76%");
                break;

            case "2.0":
            System.out.print(GPA + " GPA is a 76% to 75%");
                break;

            case "1.9":
            System.out.print(GPA + " GPA is a 75% to 74%");
                break;

            case "1.8":
            System.out.print(GPA + " GPA is a 74% to 73%");
                break;

            case "1.7":
            System.out.print(GPA + " GPA is a 73% to 72%");
                break;

            case "1.6":
            System.out.print(GPA + " GPA is a 72% to 71%");
                break;

            case "1.5":
            System.out.print(GPA + " GPA is a 71% to 70%");
                break;

            case "1.4":
            System.out.print(GPA + " GPA is a 70% to 69%");
                break;

            case "1.3":
            System.out.print(GPA + " GPA is a 69% to 68%");
                break;

            case "1.2":
            System.out.print(GPA + " GPA is a 68% to 67%");
                break;

            case "1.1":
            System.out.print(GPA + " GPA is a 67% to 66%");
                break;

            case "1.0":
            System.out.print(GPA + " GPA is a 64% to 65%");
                break;
        
            default:
            System.out.print(GPA + "GPA is 65% and below which is non-passing");
                break;
            
        }
    
    }  
}
