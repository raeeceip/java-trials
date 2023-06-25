package basics;
import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        System.out.println("How many hours did you work?:");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("What is your hourly pay rate?:");
        double rate = scanner.nextDouble();
        scanner.close();

        double grossPay = hours * rate;
        System.out.println("Your gross pay is: $" + grossPay);

        // if hours are more than 80, then print "You have worked overtime"
        if (hours > 80) {
            System.out.println("You have worked overtime");
        }

        // for every hour over 80, add 1.5 times the hourly rate to the gross pay
        if (hours > 80) {
            double overtime = (hours - 80) * (rate * 1.5);
            System.out.println("Your overtime pay is: $" + overtime);
        }

    }

}
