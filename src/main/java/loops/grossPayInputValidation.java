package loops;
import java.util.Scanner;

public class grossPayInputValidation {
    public static void main(String[] args){
        double rate  = 16.5;
        int maxHours = 80;

        System.out.println("How many hours did you work?:");
        Scanner scanner = new Scanner(System.in);
        double hours = scanner.nextDouble();

        while (hours > maxHours) {
            System.out.println("Your hours must be between 1 and 80. Try again.");
            hours = scanner.nextDouble();
        }

    }

}
