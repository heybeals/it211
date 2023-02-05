import java.util.Scanner;

public class IfStatementGPA {
    public static void main(String [ ] args) {
        double GPA;
                
        //Scanner object
        Scanner input = new Scanner(System.in);
        

        //Get input from keyboard
        System.out.println("Enter a grade percentage");
        GPA= input.nextDouble();
        input.close();
        

        // conversion to GPA
        if (GPA >=95.0) {
            System.out.print(GPA + "% is a 4.0 GPA");
        } else if (GPA >=94.0) {
            System.out.print(GPA + "% is a 3.9 GPA");
        } else if (GPA >=93.0) {
            System.out.print(GPA + "% is a 3.8 GPA");
        } else if (GPA >=92.0) {
            System.out.print(GPA + "% is a 3.7 GPA");
        } else if (GPA >=91.0) {
            System.out.print(GPA + "% is a 3.6 GPA");
        } else if (GPA >=90.0) {
            System.out.print(GPA + "% is a 3.5 GPA");
        } else if (GPA >=89.0) {
            System.out.print(GPA + "% is a 3.4 GPA");
        } else if (GPA >=88.0) {
            System.out.print(GPA + "% is a 3.3 GPA");
        } else if (GPA >=87.0) {
            System.out.print(GPA + "% is a 3.2 GPA");
        } else if (GPA >=86.0) {
            System.out.print(GPA + "% is a 3.1 GPA");
        } else if (GPA >=85.0) {
            System.out.print(GPA + "% is a 3.0 GPA");
        } else if (GPA >=84.0) {
            System.out.print(GPA + "% is a 2.9 GPA");
        } else if (GPA >=83.0) {
            System.out.print(GPA + "% is a 2.8 GPA");
        } else if (GPA >=82.0) {
            System.out.print(GPA + "% is a 2.7 GPA");
        } else if (GPA >=81.0) {
            System.out.print(GPA + "% is a 2.7 GPA");
        } else if (GPA >=80.0) {
            System.out.print(GPA + "% is a 2.5 GPA");
        } else if (GPA >=79.0) {
            System.out.print(GPA + "% is a 2.4 GPA");
        } else if (GPA >=78.0) {
            System.out.print(GPA + "% is a 2.3 GPA");
        } else if (GPA >=77.0) {
            System.out.print(GPA + "% is a 2.2 GPA");
        } else if (GPA >=76.0) {
            System.out.print(GPA + "% is a 2.1 GPA");
        } else if (GPA >=75.0) {
            System.out.print(GPA + "% is a 2.0 GPA");
        } else if (GPA >=74.0) {
            System.out.print(GPA + "% is a 1.9 GPA");
        } else if (GPA >=73.0) {
            System.out.print(GPA + "% is a 1.8 GPA");
        } else if (GPA >=72.0) {
            System.out.print(GPA + "% is a 1.7 GPA");
        } else if (GPA >=71.0) {
            System.out.print(GPA + "% is a 1.6 GPA");
        } else if (GPA >=70.0) {
            System.out.print(GPA + "% is a 1.5 GPA");
        } else if (GPA >=69.0) {
            System.out.print(GPA + "% is a 1.4 GPA");
        } else if (GPA >=68.0) {
            System.out.print(GPA + "% is a 1.3 GPA");
        } else if (GPA >=67.0) {
            System.out.print(GPA + "% is a 1.2 GPA");
        } else if (GPA >=66.0) {
            System.out.print(GPA + "% is a 1.1 GPA");
        } else if (GPA >=65.0) {
            System.out.print(GPA + "% is a 1.0 GPA");
        } else {
            System.out.print(GPA + "% is a 0.0 GPA");
        }           
    }
}
