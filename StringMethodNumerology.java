import java.util.Scanner;

public class StringMethodNumerology {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter birth date (mm/dd/yyyy): ");
            String bday = input.nextLine();
            Integer month = null;
            Integer day = null;
            Integer year = null;
            try {
                String[] bdayArr = bday.split("/");
                month = Integer.parseInt(bdayArr[0]);
                day = Integer.parseInt(bdayArr[1]);
                year = Integer.parseInt(bdayArr[2]);
            } catch (Exception e) {
                System.out.println("Use forward slashes between month, day, and year!");
                continue;
            }
            String[] bdayArr = bday.split("/");

            if (month < 1 || month > 12) {
                System.out.println("Invalid Month : " + month);
                continue;
            }

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 1 || day > 31) {
                    System.out.println("Invalid Day: " + day);
                    continue;
                }
            } else if (month == 2) {
                if (year % 4 == 0) {
                    if (day < 1 || day > 29) {
                        System.out.println("Invalid Day: " + day);
                        continue;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        System.out.println("Invalid Day: " + day);
                        continue;
                    }
                }
            } else {
                if (day < 1 || day > 30) {
                    System.out.println("Invalid Day: " + day);
                    continue;
                }
            }

            if (year < 1880 || year > 2280) {
                System.out.println("Invalid Year: " + year);
                continue;
            }

            String date = (month + day + year) + "";

            int sum = 11;
            while (sum > 10) {
                sum = 0;
                String[] dateArr = date.split("");
                for (int i = 0; i < dateArr.length; i++) {
                    sum += Integer.parseInt(dateArr[i]);
                }
                date = sum + "";
            }

            switch (sum) {
            case 1:
                System.out.println("-1- In Numerology the number 1 is the root of opportunity in our lives. It is a symbol of confidence, power, and action.");
                break;
            case 2:
                System.out.println("-2- In Numerology the number 2 is a supremely feminine force, one that represents both grace and power. It is cooperative, always aiming to bring peace and balance back to a relationship or situation.");
                break;
            case 3:
                System.out.println("-3- In Numerology the number 3 represents communication, connection, and unbridled creativity.");
                break;
            case 4:
                System.out.println("-4- In Numerology the number 4 represents practicality, hard work, discipline, and responsibility.");
                break;
            case 5:
                System.out.println("-5- In Numerology the number 5 is a master of change, able to go with the flow and adapt itself to thrive in different environments and social situations. It is happiest when things feel fresh, high energy, and full of possibility.");
                break;
            case 6:
                System.out.println("-6- In Numerology the number 6 is the embodiment of the heart. It represents unconditional love and the ability to support, nurture, and heal.");
                break;
            case 7:
                System.out.println("-7- In Numerology the number 7 is an analytical number that enjoys gathering and filtering through information to find answers. Still, it has a more powerful intuition than you might expect which it uses as a guide.");
                break;
            case 8:
                System.out.println("-8- In Numerology the number 8 centers around intention, hard work, success, and balance.");
                break;
            case 9:
                System.out.println("-9- In Numerology the number 9 is represents completion, but not finality. Think of it more in a cyclical sense; it acts as an usher in this process of transition or transformation, guiding and empowering us with its wisdom.");
                break;
            }
            break;
        } while (true);
        input.close();
    }
}