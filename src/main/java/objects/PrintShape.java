package objects;

import java.util.Scanner;

public class PrintShape {
    // add a scanner
    // ask the user for the color and filled
    // create a shape object with the color and filled
    // print the shape object

    public static void main(String[] args){
        Shape shape2 = getColorAndFilled();
        System.out.println(shape2);
    }

    public static Shape getColorAndFilled(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the color: ");
        String color = scanner.nextLine();
        System.out.println("Enter true or false for filled: ");
        boolean filled = scanner.nextBoolean();
        return new Shape(color, filled);
    }
}
